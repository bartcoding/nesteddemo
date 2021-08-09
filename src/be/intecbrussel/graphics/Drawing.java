package be.intecbrussel.graphics;

import java.awt.*;
import java.util.Iterator;

public class Drawing implements Drawable, Iterable<Drawable> {

   private static final int SIZE = 100;
   private Drawable[] drawables = new Drawable[SIZE];
   private int size = 0;


   public void add(Drawable d) {
      if (!present(d)) {
         int location = getFreeLocation();
         drawables[location] = d;
         size++;
      }
   }

   public void remove(Drawable d) {
      for (int i = 0; i < drawables.length; i++) {
         if (d.equals(drawables[i])) {
            drawables[i] = null;
            size--;
            return;
         }
      }
   }

   public void clear() {
      drawables = new Drawable[SIZE];
      size = 0;
   }

   public int getSize() {
      return size;
   }

   /* Private methods */
   private boolean present(Drawable s) {
      for (int i = 0; i < drawables.length; i++) {
         if (s.equals(drawables[i])) return true;
      }
      return false;
   }

   private int getFreeLocation() {
      for (int i = 0; i < drawables.length; i++) {
         if (drawables[i] == null) return i;
      }
      // Create new array
      Drawable[] temp = new Drawable[drawables.length + SIZE];
      for (int i = 0; i < drawables.length; i++) {
         temp[i] = drawables[i];
      }
      int location = drawables.length;
      drawables = temp;

      return location;
   }

   public void draw(Graphics g) {
      for (Drawable d : drawables) {
         if (d != null) {
            d.draw(g);
         }
      }
   }

   public void scale(int factor) {
      for (Drawable d : drawables) {
         if (d != null) {
            d.scale(factor);
         }
      }
   }
   

   public String toString() {
      StringBuilder sb = new StringBuilder();
      sb.append("Drawing with ").append(getSize()).append(" elements:\n");
      for (Drawable d : drawables) {
         if (d != null) {
            sb.append(d.toString()).append("\n");
         }
      } 
      return sb.toString();
   }
   @Override
   public Iterator<Drawable> iterator() {
      // Returns an instance of a class that implements Iterator
      return new DrawableIterator();
   }

   /**
    * this Iterator iterates over the drawables array
    * It keeps track of how many iterations (loops) where already done using a counter variable
    *
    * Every time we iterate (use the combination of hasnext + next) we return the next object in the drawables array
    * until all drawables have been returned by the method next
    *
    */
   private class DrawableIterator implements Iterator<Drawable>{

      int index = 0;

      @Override
      public boolean hasNext() {
         return size > index;
      }

      @Override
      public Drawable next() {
         return drawables[index++];
      }
   }

}

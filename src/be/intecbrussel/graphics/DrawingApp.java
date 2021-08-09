package be.intecbrussel.graphics;

import java.util.Iterator;

public class DrawingApp {
   public static void main(String[] args) {
      Drawing drawing = new Drawing();
      
      drawing.add(new Rectangle(5,6));
      drawing.add(new Square(5));
      for(int i = 0; i< 356; i++) {
         drawing.add(new Circle(i));
      }


      //print all drawables?

/*      Iterator iterorOfDrawing;
      iterorOfDrawing = drawing.iterator();

      while (iterorOfDrawing.hasNext()){
         System.out.println(iterorOfDrawing.next());
      }*/


      for (Drawable drawable: drawing){
         System.out.println(drawable);
      }
      
            
   }   
}

package be.intecbrussel.staticnesteddemo;

public class Outer {

    public static class Inner{

        private int number;

        public void setNumber(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }
    }

    public static enum InnerEnum{
        FIRST,SECOND,THIRD;

    }



}

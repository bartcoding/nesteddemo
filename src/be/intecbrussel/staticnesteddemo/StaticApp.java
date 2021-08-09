package be.intecbrussel.staticnesteddemo;

public class StaticApp {


    public static void main(String[] args) {

        Outer.Inner inner = new Outer.Inner();

        Outer.InnerEnum innerEnum = Outer.InnerEnum.FIRST;

    }



}

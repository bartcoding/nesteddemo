package be.intecbrussel.anonymousnestedclass;

public class ButtonApp {


    public static void main(String[] args) {


        Pushable pushable1 = new Pushable() {
            @Override
            public void push() {
                System.out.println("thank you for your purchase, hope to see you soon!");

            }
        };
        Pushable pushable2 = new Pushable() {
            @Override
            public void push() {
                System.out.println("I am not easily pushed!!");

            }
        };

        pushable1 = pushable2;
        pushable1.push();
        pushable2.push();



    }

}

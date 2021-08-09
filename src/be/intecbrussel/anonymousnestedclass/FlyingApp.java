package be.intecbrussel.anonymousnestedclass;

public class FlyingApp {

    public static void main(String[] args) {

        Flyable flyable = new Flyable() {
            @Override
            public void fly() {
                System.out.println("this duck is ready to fly");
                System.out.println("flap flap flap");
            }
        };

        Flyable flyable2 = new Flyable() {
            @Override
            public void fly() {
                System.out.println("this goose is ready to fly");
                System.out.println("flap flap flap");
            }
        };

        Flyable flyable3 = new Flyable() {
            @Override
            public void fly() {
                System.out.println("warming up jet engines");
                System.out.println("ghadofiahdpoihadgopiha");
            }
        };

        flyable.fly();
        flyable2.fly();
        flyable3.fly();
    }

}

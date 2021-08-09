package be.intecbrussel.nesteddemo;

public class CarApp {

    public static void main(String[] args) {

        Car car = new Car("blue", 4,false);

        Car.Engine engine = car.new Engine(5,"");

        engine.talkAboutOuterClass();

    }

}

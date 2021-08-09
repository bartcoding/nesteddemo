package be.intecbrussel.nesteddemo;

public class Car {

    private String colour;
    private int numberOfDoors;
    private boolean windowIsTinted;

    private Engine engine;

    public Car(String colour, int numberOfDoors, boolean windowIsTinted) {
        this.colour = colour;
        this.numberOfDoors = numberOfDoors;
        this.windowIsTinted = windowIsTinted;

        engine = new Engine(0,"gasoline");
    }

    public void readOutDashboard(){
        System.out.println("rpm's of the engine: " + engine.getRpm());
    }
    //put your foot down on the gass paddle
    public void putPeddleToMetal(){

        engine.setRpm(3000);

    }

    public String getColour() {
        return colour;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public boolean isWindowIsTinted() {
        return windowIsTinted;
    }

    public class Engine {

        private int rpm;
        private String fuelType;


        public Engine(int rpm, String fuelType) {
            this.rpm = rpm;
            this.fuelType = fuelType;
        }

        public void setRpm(int rpm) {
            this.rpm = rpm;
        }

        public int getRpm() {
            return rpm;
        }

        public String getFuelType() {
            return fuelType;
        }

        public void talkAboutOuterClass(){
            System.out.println("my outer class has this colour: " + colour );
        }
    }

}

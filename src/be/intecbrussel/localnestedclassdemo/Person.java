package be.intecbrussel.localnestedclassdemo;

public class Person {

    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Object performDance(){

        int a = 0;

        class DanceStyle{
            String explanationOfDance;
            String nameOfDance;

            @Override
            public String toString() {

                return "DanceStyle{" +
                        "explanationOfDance='" + explanationOfDance + '\'' +
                        ", nameOfDance='" + nameOfDance + '\'' +
                        '}';
            }
        }
        DanceStyle danceStyle = new DanceStyle();

        danceStyle.nameOfDance = "riverDance";
        danceStyle.explanationOfDance = "jump, hop and skip a lot and do a crazy amount of moves";

        return danceStyle;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

package be.intecbrussel.localnestedclassdemo;

public class PersonApp {

    public static void main(String[] args) {

        Person person = new Person("Jaak", "DeClerk");

        Object o = person.performDance();

        o.toString();
        o.toString();


    }


}

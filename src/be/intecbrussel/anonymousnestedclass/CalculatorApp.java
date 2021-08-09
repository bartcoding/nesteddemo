package be.intecbrussel.anonymousnestedclass;

public class CalculatorApp {

    public static void main(String[] args) {

        Calculation sum = new Calculation() {
            @Override
            public int calculate(int number1, int number2) {
                return number1 + number2;
            }
        };

        Calculation multiplication = (number1, number2) -> number1 * number2;

        System.out.println(sum.calculate(1, 5));
        System.out.println(multiplication.calculate(3, 5));

    }
}

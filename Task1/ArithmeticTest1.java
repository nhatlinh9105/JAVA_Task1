package Task1;

public class ArithmeticTest1 {
    public static void main(String[] args) {
        int number1 = 98;
        int number2 = 5;
        int sum, difference, product, quotient, remainder;
        sum = number1 + number2;
        difference = number1 - number2;
        product = number1 * number2;
        quotient = number1 / number2;
        remainder = number1 % number2;


        System.out.println("The sum, difference, product, quotient and remainder of " + number1 + " and " + number2 + " are " +
                sum + ", " + difference + ", " + product + ", " + quotient + " and " + remainder);

        ++number1;
        --number2;
        System.out.println("number1 after increment is " + number1);
        System.out.println("number2 after decrement is " + number2);
        quotient = number1 / number2;
        System.out.println("The new quotient of " + number1 + " and " + number2 + " is " + quotient);
    }
}

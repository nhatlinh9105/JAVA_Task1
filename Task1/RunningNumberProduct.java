package Task1;

public class RunningNumberProduct {
    public static void main(String[] args) {
        int lowerbound = 1;
        int upperbound = 10;
        int product = 1;
        int number = 1;
        while (number <= upperbound) {
            product = product * number;
            number++;
        }
        System.out.println("The product from " + lowerbound + " to " + upperbound + " is " + product);
    }
}

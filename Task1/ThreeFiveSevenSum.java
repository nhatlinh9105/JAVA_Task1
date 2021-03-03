package Task1;

public class ThreeFiveSevenSum {
    public static void main(String[] args) {
        int lowerbound = 1, upperbound = 1000;

        int total = 0;
        int number = lowerbound;
        while (number <= upperbound) {

            if ((number % 3 == 0) && (number % 5 == 0) && (number % 7 == 0))  {
                total += number - ( 15 + 21 + 35 + 105);
            }
                ++number;
        }
        System.out.printf("Sum of number from " + lowerbound + " to " + upperbound + " is %d", total);

    }
}

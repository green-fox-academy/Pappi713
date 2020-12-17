import java.util.Scanner;

public class Summing {
    public static void main(String[] args) {
        // Create the usual class wrapper and main method on your own.

        // Write a function called `sum` that returns the sum of numbers from zero to the given parameter
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the number whit it you want me to count!");
        int number = scanner.nextInt();
        System.out.println("The summ of the numbers is: " + sum(number));
    }

    public static int sum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        return sum;
    }
}

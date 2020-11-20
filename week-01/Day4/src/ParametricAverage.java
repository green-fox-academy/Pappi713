import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gimme the total number you wanna use!");
        int numberCount = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= numberCount; i++) {
            System.out.println("Give me the :" + i + ". Number!");
            sum = sum + scanner.nextInt();
        }
        double average = (double) sum / numberCount;
        System.out.println("The sum is: " + sum);
        System.out.println("The average is: " + String.format("%.3f", average));


    }
}

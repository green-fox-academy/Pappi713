import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input,
        // Then prints "Odd" if the number is odd, or "Even" if it is even.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gimme a number!");
        int decide = scanner.nextInt();
        boolean isOdd;
        if (decide % 2 == 1) {
            isOdd = false;
            System.out.println("Odd");
        } else {
            isOdd = true;
            System.out.println("Even");
        }
    }
}
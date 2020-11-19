import java.util.Scanner;

public class DrawPiramid {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // pyramid like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //
        // The pyramid should have as many lines as the number was

        int rows;
        int k = 0;
        Scanner scanner = new Scanner(System.in);
        rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++, k = 0) {
            for (int j = 1; j <= rows-1; j++) {
                System.out.print("");
            }
        }
    }
}

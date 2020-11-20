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


        //I did it some help since after 1,5 hour stil could not figure out.
        int rows=7;
        int k=0;
        /*System.out.println("Plox gimme the size of the piramid!!!");
        Scanner scanner = new Scanner(System.in);
        rows = scanner.nextInt();*/
        for (int i = 1; i <= rows; i++, k=0) {
            for (int j = 1; j <= rows-i; j++) {
                System.out.print("  ");
            }
            while(k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.println("");
        }
    }
}

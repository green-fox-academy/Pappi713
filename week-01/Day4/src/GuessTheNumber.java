import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
    // Write a program that stores a number, and the user has to figure it out.
    // The user can input guesses, after each guess the program would tell one
    // of the following:
    //
    // The stored number is higher
    // The stored number is lower
    // You found the number: 8

        Random r = new Random();
        int low = 1;
        int high = 100;
        int result = r.nextInt(high-low) + low;
        //System.out.println(result);

        Scanner scanner=new Scanner(System.in);
        int tipp;


        do {
            tipp=scanner.nextInt();
            if(tipp<result){
                System.out.println("The stored number is higher");
            }
            else if (tipp>result){
                System.out.println("The stored number is lower");
            }
            else{
                System.out.println("You found the number: " + tipp);
            }
        }
        while (tipp!=result);
    }
}

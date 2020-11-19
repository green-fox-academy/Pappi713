import java.util.Scanner;

public class PartyIndicator {
    public static void main(String[] args) {
        // Write a program that asks for two numbers
        // The first number represents the number of girls that comes to a party, the
        // second the boys
        // It should print: The party is excellent!
        // If the the number of girls and boys are equal and 20 or more people are coming to the party
        //
        // It should print: Quite cool party!
        // If there are 20 or more people coming to the party but the girl - boy ratio is not 1-1
        //
        // It should print: Average party...
        // If there are less people coming than 20
        //
        // It should print: Sausage party
        // If no girls are coming, regardless the count of the people
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the number of the Girls");
        int girls = scanner.nextInt();
        System.out.println("Give me the number of the Boys");
        int boys = scanner.nextInt();
        int b_g = girls + boys;
        if (b_g >= 20 && girls == boys) {
            System.out.println("The party is excellent");
        } else if (b_g >= 20 && girls % boys != 0) {
            System.out.println("Quite cool party!");
        } else if (b_g < 20) {
            System.out.println("Average party...");
        } else if (girls==0) {
            System.out.println("Sausage party");
        }
    }
}

import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have

        int chickenNumber;
        int pigNumber;
        int totalLegs;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the numbers of the chickens!");
        chickenNumber = scanner.nextInt();
        System.out.println("Give me the numbers of the pigs!");
        pigNumber = scanner.nextInt();

        totalLegs = 2 * chickenNumber + 4 * pigNumber;
        System.out.println("The total numbers of the leg's is: " +totalLegs);

    }
}
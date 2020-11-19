import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        // Write a program that asks for a double that is a distance in miles,
        // then it converts that value to kilometers and prints it

        double distance;
        double distanceKilo;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gimme the distance you want to convert to kilometer plox");
        distance = scanner.nextDouble();
        distanceKilo = distance * 1.609344;
        System.out.println("The distance in Kilometer is: " + distanceKilo);


    }
}
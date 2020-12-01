import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.Scanner;

public class WriteMultipleLines {
    public static void main(String[] args) {
        // Create a function that takes 3 parameters: a path, a word and a number
        // and is able to write into a file.
        // The path parameter should be a string that describes the location of the file you wish to modify
        // The word parameter should also be a string that will be written to the file as individual lines
        // The number parameter should describe how many lines the file should have.
        // If the word is 'apple' and the number is 5, it should write 5 lines
        // into the file and each line should read 'apple'
        // The function should not raise any errors if it could not write the file.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me the location");
        String location = scanner.next();
        System.out.println("Please give me the word that you want to write");
        String word = scanner.next();
        System.out.println("Please give me how many times to you want to write");
        int number = scanner.nextInt();

        writeLines(location, word, number);

    }

    public static void writeLines(String location, String world, int number) {
        Path path = Paths.get(location);
        try {
            for (int i = 0; i < number; i++) {
                Files.write(path, Arrays.asList(world), StandardOpenOption.APPEND);
            }

        } catch (IOException ex) {
            System.out.println("Could not write into the file");
        }
    }
}

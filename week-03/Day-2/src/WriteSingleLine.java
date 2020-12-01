import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;

public class WriteSingleLine {
    public static void main(String[] args) {
        // Write a function that is able to manipulate a file
        // By writing your name into it as a single line
        // The file should be named "my-file.txt"
        // In case the program is unable to write the file,
        // It should print the following error message: "Unable to write file: my-file.txt"
        writeToFile();
    }

    public static void writeToFile() {
        String fileName = "my-file.txt";
        String myName = "Kristof Papp";
        try {
            Path path = Paths.get(fileName);
            Files.write(path, Arrays.asList(myName));
        } catch (IOException ex) {
            System.out.println("Unable to write file: my-file.txt");
        }

    }
}

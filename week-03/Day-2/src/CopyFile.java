import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) {
        // Write a function that copies the contents of a file into another
        // It should take the filenames as parameters
        // It should return a boolean that shows if the copy was successful
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add the location of the source file");
        String location1 = scanner.next();
        System.out.println("Add the location of the destination file");
        String location2 = scanner.next();
        System.out.println(copyFile(location1, location2));
    }

    public static boolean copyFile(String locationf1, String locationf2) {

        Path pathf1 = Paths.get(locationf1);
        Path pathf2 = Paths.get(locationf2);

        try {
            //get all lines from the first file
            List<String> lines = Files.readAllLines(pathf1);
            for (String line : lines) {
                Files.write(pathf2, Arrays.asList(line), StandardOpenOption.APPEND);
            }

        } catch (IOException e) {
            return false;
        }
        System.out.println();
        return true;
    }
}

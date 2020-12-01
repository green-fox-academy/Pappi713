import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Doubled {
    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt

        removeDuplicatedChars("duplicated-chars.txt");
    }

    public static void removeDuplicatedChars(String filelocation) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(filelocation));
            List<String> lines2 = new ArrayList<>();
            String tempString = "";
            for (String line : lines) {
                String[] lineParts = line.split("  ");
                for (int i = 0; i < lineParts.length; i++) {
                    tempString = "";
                    for (int j = 0; j < lineParts[i].length() - 1; j++) {
                        if (j % 2 == 0) {
                            tempString = tempString + String.valueOf(lineParts[i].charAt(j));
                        }
                    }
                    lineParts[i] = tempString;
                    //System.out.println(Arrays.toString(lineParts));
                }
                System.out.println();
                lines2.add(Arrays.toString(lineParts));
            }
            Files.write(Path.of(filelocation), lines2);
        } catch (IOException e) {
            System.out.println("Could not read from the file");
            // Log the exception

        }
    }
}

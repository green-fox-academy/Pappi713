import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {
    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt
        reverseLines("reversed-lines.txt");
    }


    public static void reverseLines(String location) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(location));
            List<String> lines2 = new ArrayList<>();
            String reversed = "";
            for (String line : lines) {
                reversed = "";
                for (int i = 0; i < line.length(); i++) {
                    reversed = reversed + String.valueOf(line.charAt(line.length() - 1 - i));
                }
                System.out.println(reversed);
                lines2.add(reversed);
            }
            Files.write(Path.of(location), lines2);
        } catch (IOException ex) {
            System.out.println("Unable to write file: my-file.txt");
        }

    }
}


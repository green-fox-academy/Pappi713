import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        String filename = "my-file.txt";
        System.out.println(countNumberOfLines(filename));
    }

    public static int countNumberOfLines(String filename) {
        int linecounter = 0;
        try {
            List<String> lines = Files.readAllLines(Paths.get(filename));

            for (String line : lines) {
                linecounter++;
            }
        } catch (IOException e) {
            return 0;
        }
        return linecounter;
    }
}

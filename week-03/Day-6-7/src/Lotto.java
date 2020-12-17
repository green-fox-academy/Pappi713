import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Lotto {
    public static void main(String[] args) {

    }

    public static List<String> readfile(String filepath){
        try {
            List<String> lines = Files.readAllLines(Paths.get(filepath));
        } catch (IOException e) {
            System.out.println("Issue with the file reading");
        }
        return null;
    }
}

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedOrder {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-order.txt
        reverseLines("reversed-order.txt");
    }

    public static void reverseLines(String location){
        try {
            List<String> lines = Files.readAllLines(Paths.get(location));
            List<String> lines2 = new ArrayList<>();

            for(int i=0;i <lines.size();i++){
                lines2.add(lines.get(lines.size()-1-i));
            }
            Files.write(Path.of(location), lines2);
        } catch (IOException ex) {
            System.out.println("Unable to write file: my-file.txt");
        }
    }
}

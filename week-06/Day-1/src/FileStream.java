import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class FileStream {
    public static void main(String[] args) {
        List<String> strList = null;
        try {
            strList = Files.readAllLines(Path.of("content.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        Stream<String> lines = strList.stream();
        lines.forEach(x-> System.out.println(x+"hali"));
    }
}

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunOfFiles {
    public static void main(String[] args) {
        List<String> allWords = new ArrayList<>();
        allWords=allwords("content.txt");
        mostCommonWords(allWords);
    }

    public static void mostCommonWords(List<String> allWords) {
        Map<String, Long> frequency =
                allWords.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        frequency.remove("");
        for(int i=0;i<100;i++){
            Long max=Long.MIN_VALUE;
            String key="";
            Integer pos;
            Set<Map.Entry<String,Long>> entries=frequency.entrySet();
            for(Map.Entry<String,Long> entry:entries) {
                pos=0;
                if(entry.getValue()>max) {
                    max=entry.getValue();
                    key=entry.getKey().toString();
                }
            }
            System.out.println(key +"="+max);
            frequency.remove(key);
        }
    }

    public static List<String> allwords(String filename) {
        List<String> allWords = new ArrayList<>();
        List<String> content = readFile(filename);
        for (String str : content) {
            str = str.replaceAll("\"", "");
            str = str.replaceAll(",", "");
            String[] tempArray = str.split(" ");
            allWords.addAll(Arrays.asList(tempArray));
        }
        return allWords;
    }

    public static List<String> readFile(String filename) {
        Path instructionPath = Paths.get(filename);
        List<String> content = new ArrayList<>();
        try {
            content = Files.readAllLines(instructionPath);
        } catch (IOException e) {
            System.out.println("File does not exist!");
        }
        return content;
    }
}

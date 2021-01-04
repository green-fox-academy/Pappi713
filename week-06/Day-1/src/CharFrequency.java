import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFrequency {
    public static void main(String[] args) {
        //    Write a Stream Expression to find the frequency of characters in a given string!
        charFreq("akfashfl");
    }

    public static void charFreq(String string){
        Map<Character, Long> frequency =
                string.chars()
                        .mapToObj(c -> (char)c)
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(frequency);
    }
}

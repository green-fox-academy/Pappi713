import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountLetters {
//    Write a function, that takes a string as an argument and returns a dictionary with all letters in the string as keys,
//    and numbers as values that shows how many occurrences there are.
//    Create a test for that.

    public static Map hashMapper(String str) {
        Map<Character, Integer> hm= new HashMap<>();
        for(int i=0;i<str.length();i++){
            if(!hm.containsKey((Character)str.charAt(i))){
                hm.put(str.charAt(i),1);
            }
            else{
                hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
            }
        }
        hm.forEach((key, value) -> System.out.println(key + ":" + value));
        return hm;
    }

    public static Map count(String str) {
        Map<String, Long> charCount = IntStream.range(0, str.length())
                .mapToObj(i -> str.substring(i, i + 1))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        charCount.forEach((key, value) -> System.out.println(key + ":" + value));
        return charCount;
    }

    public static void main(String[] args) {
        //count("megszentsegtelenithetetlensegeskedeseitekert");
        hashMapper("alma");
    }
}

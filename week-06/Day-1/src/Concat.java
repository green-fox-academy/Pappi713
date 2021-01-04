import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Concat {
    public static void main(String[] args) {
//Write a Stream Expression to concatenate a Character list to a string!
        System.out.println(charArraytoString());


    }
    public static String charArraytoString(){
        List<Character> characterList = Arrays.asList('N', 'y', 'a', 's', 'g','e','m');
        String string = characterList.stream().map(String::valueOf).collect(Collectors.joining());
        return string;
    }
}

import java.util.Arrays;
import java.util.List;

public class Cities {
//    //        Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list:
public static void main(String[] args) {
    cities('A');
}
    public static void cities(char c) {
        List<String> cities = Arrays.asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM", "ABU DHABI", "PARIS");
        cities.stream().filter(x->x.startsWith(String.valueOf(c))).forEach(System.out::println);
    }
}
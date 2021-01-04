import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers1 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        numbers1.stream().filter(x -> x % 2 == 0).forEach(System.out::println);
        System.out.println();
//        Write a Stream Expression to get the squared value of the positive numbers from the following list:
        List<Integer> numbers2 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        numbers2.stream().filter(x -> x > 0).map(x -> x * x).forEach(System.out::println);
        System.out.println();
//        Write a Stream Expression to find which number squared value is more then 20 from the following list:
        List<Integer> numbers3 = Arrays.asList(3, 9, 2, 8, 6, 5);
        numbers3.stream().filter(x -> x * x > 20).forEach(System.out::println);
        System.out.println();
        //    Write a Stream Expression to get the average value of the odd numbers from the following list:
        List<Integer> numbers4 = Arrays.asList(1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14);
        OptionalDouble average = numbers4.stream().mapToInt(x -> x).filter(x -> x % 2 == 1 || x % 2 == -1).average();
        if (average.isPresent()) {
            System.out.println(average.getAsDouble());
        } else {
            System.out.println("nincsen maximum");
        }
        System.out.println();
//        Write a Stream Expression to get the sum of the odd numbers in the following list:
        List<Integer> numbers5 = Arrays.asList(5, 9, 1, 2, 3, 7, 5, 6, 7, 3, 7, 6, 8, 5, 4, 9, 6, 2);
        System.out.println("The sum of the lis ts: " + numbers5.stream().mapToInt(x -> x).filter(x -> x % 2 == 1 || x % 2 == -1).reduce(0, Integer::sum));
        System.out.println();
//        Write a Stream Expression to find the uppercase characters in a string! 65,90
        String string="KakaMakAmEkemOka";
        string.chars().filter(x-> x>=65 && x<=90).mapToObj(x-> (char)x).forEach(System.out::println);
    }
}

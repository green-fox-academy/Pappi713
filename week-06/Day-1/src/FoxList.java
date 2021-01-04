import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FoxList {
    public static void main(String[] args) {
        List<Fox> foxList = new ArrayList<>();
        foxList.add(new Fox("Fox1","Green",16));
        foxList.add(new Fox("Fox2","Blue",22));
        foxList.add(new Fox("Fox3","Red",46));
        foxList.add(new Fox("Fox4","Green",3));
        foxList.add(new Fox("Fox5","White",7));
        foxList.add(new Fox("Fox6","Blue",90));
        foxList.add(new Fox("Fox7","Blue",32));
        System.out.println("foxes with green color:");
        greenFox(foxList);
        System.out.println("foxes with green color, and age less then 5 years:");
        youngGreenFox(foxList);
        System.out.println("ColorMap");
        colorFrequency(foxList);
    }
//    Write a Stream Expression to find the foxes with green color!
    public static void greenFox(List<Fox> foxList){
        foxList.stream().filter(fox->fox.color.equals("Green")).map(fox ->fox.name).forEach(System.out::println);
    }
//    Write a Stream Expression to find the foxes with green color, and age less then 5 years!
    public static void youngGreenFox(List<Fox> foxList){
        foxList.stream().filter(fox->fox.color.equals("Green") &&fox.age<5).map(fox ->fox.name).forEach(System.out::println);
    }
//    Write a Stream Expression to find the frequency of foxes by color!
    public static void colorFrequency(List<Fox> foxList){
        Map<String, Long> colorMap = foxList.stream().collect(Collectors.groupingBy(Fox::getColor, Collectors.counting()));
        System.out.println(colorMap);
    }

}

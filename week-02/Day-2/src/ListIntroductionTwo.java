import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIntroductionTwo {
    public static void main(String[] args) {

        String[] strings = {"Apple", "Avocado", "Blueberries", "Durian", "Lychee"};
        List<String> listA = new ArrayList<String>(Arrays.asList(strings));
        System.out.println(listA);
        List<String> listB = new ArrayList<String>();

        listB.addAll(listA);
        System.out.println(listB);

        System.out.println(listA.contains("Durian"));
        System.out.println(listA);

        listB.remove("Durian");
        System.out.println(listB);

        listA.add(3, "Kiwifruit ");
        System.out.println(listA);

        if (listA.size() > listB.size()) System.out.println("ListA has more element");
        else if (listA.size() < listB.size()) System.out.println("ListB has more element");
        else System.out.println("The two list has the same number of elemets");

        System.out.println("The index of Avokado is: " + listA.indexOf("Avocado"));
        if (listB.indexOf("Durian") < 0) System.out.println("Durian is not in the listB");
        else System.out.println("The index of Durian is: " + listB.indexOf("Durian"));

        listB.addAll(Arrays.asList("Passion Fruit","Pomelo"));
        System.out.println(listB);

        System.out.println(listA.get(2));


    }
}

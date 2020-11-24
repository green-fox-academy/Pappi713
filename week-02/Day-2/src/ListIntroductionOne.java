import java.util.ArrayList;
import java.util.List;

public class ListIntroductionOne {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        System.out.println(names.size());
        names.add("William");

        System.out.println(names.isEmpty());

        names.add("John");
        names.add("Amanda");

        System.out.println(names.size());
        System.out.println(names.get(2));

        int i = 1;
        for (String name : names) {

            System.out.println(i + ". " + names.get(i - 1));
            i++;
        }

        names.remove(names.get(1));
        i = names.size();
        for (String name : names) {

            System.out.println(names.get(i - 1));
            i--;
        }

        names.removeAll(names);
        System.out.println(names);
    }
}

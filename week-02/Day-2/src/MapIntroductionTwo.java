import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapIntroductionTwo {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>() {{
            put("978-1-60309-452-8", "A Letter to Jo");
            put("978-1-60309-459-7", "Lupus");
            put("978-1-60309-444-3", "Red Panda and Moon Bear");
            put("978-1-60309-461-0", "The Lab");
        }};
        //System.out.println(map);

        for (Map.Entry<String, String> stringstring : map.entrySet()) {
            System.out.println(stringstring.getValue() + " (ISBN: " + stringstring.getKey());
        }

        map.remove("978-1-60309-444-3");
        //System.out.println(map);

        map.values().remove("The Lab");
        System.out.println(map);

        //listB.addAll(Arrays.asList("Passion Fruit","Pomelo"));
        map.putAll(new HashMap<>() {{
            put("978-1-60309-450-4", "They Called Us Enemy");
            put("978-1-60309-453-5", "Why Did We Trust Him?");
        }});
        System.out.println(map);

        System.out.println(map.containsKey("478-0-61159-424-8"));

        System.out.println(map.get("978-1-60309-453-5"));


    }
}

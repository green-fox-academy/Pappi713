import java.util.HashMap;
import java.util.Map;

public class MapIntroductionOne {
    public static void main(String[] args) {

        Map<Integer, Character> map = new HashMap<>();

        System.out.println(map.isEmpty());

        map.put(97, 'a');
        map.put(98, 'b');
        map.put(99, 'c');
        map.put(65, 'A');
        map.put(66, 'B');
        map.put(67, 'C');

        for (Integer number : map.keySet()) {
            System.out.println(number);
        }

        for (Integer number : map.keySet()) {
            System.out.println(map.get(number));
        }

        System.out.println(map.size());

        System.out.println(map.get(99));

        map.remove(map.get(97));
        //System.out.println(map);
        boolean isFound = false;
        int searchingNumber = 100;
        for (Integer key : map.keySet()) {
            if (searchingNumber == key) {
                isFound = true;
                break;
//            } else{
//                isFound = false;
//            }
            }
        }
        System.out.println(isFound);
        System.out.println(map.containsKey(searchingNumber));

        map.clear();
        System.out.println(map);
    }

}

import javax.sound.midi.Soundbank;
import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>() {{
            put("Eggs", 200);
            put("Milk", 200);
            put("Fish", 400);
            put("Apples", 150);
            put("Bread", 50);
            put("Chicken", 550);
        }};
        //prize of fish
        System.out.println("The prize of the fish is: " + map.get("Fish"));
        //most expensive
        int mostExpensive = Integer.MIN_VALUE;
        for (String prd : map.keySet()) {
            if (map.get(prd) > mostExpensive) {
                mostExpensive = map.get(prd);
            }
        }
        System.out.println(mostExpensive);
        String intKey = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (mostExpensive == entry.getValue()) {
                intKey = entry.getKey();
                break;
            }
        }
        System.out.println("The most expensive product is: " + intKey);

        //average procuct prize
        int sumOfProduct = 0;
        int productCounter = 0;
        for (String prd : map.keySet()) {
            sumOfProduct = sumOfProduct + map.get(prd);
            productCounter++;
        }
        System.out.println("The average prize of the product's is: " + (double) sumOfProduct / productCounter);

        //itemst below 300
        int itemsbelow = 0;
        for (String prd : map.keySet()) {
            if (map.get(prd) < 300) {
                itemsbelow++;
            }
        }
        System.out.println("The number of items below 300 is: " + itemsbelow);
//WIP


    }
}

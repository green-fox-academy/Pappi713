import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingList {
    public static void main(String[] args) {
        String[] strings = {"Eggs", "milk", "fish", "apples", "bread", "chicken"};
        List<String> shoppingList = new ArrayList<String>(Arrays.asList(strings));
        itemsearch(shoppingList);

    }
    //add alist of items as search parameter
    public static void itemsearch(List<String> shoppingList) {



        if(shoppingList.contains("milk")){
            System.out.println("The list contains milk");
        }
        else{
            System.out.println("We dont have milk on our list");
        }

        if(shoppingList.contains("bananas")){
            System.out.println("the list contains bananas");
        }
        else{
            System.out.println("We dont have bananas on our list");
        }
    }
}

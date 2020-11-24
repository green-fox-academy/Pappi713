import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonalFinance {
    //    listB.addAll(Arrays.asList("Passion Fruit","Pomelo"));
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(500, 1000, 1250, 175, 800, 120));
        System.out.println(numbers);
        int sum = 0;
        for (Integer i : numbers) {
            sum = sum + i;
        }
        System.out.println("The sum of the numbers is: " + sum);

        int greatestExpense=0;
        for (Integer i : numbers) {
            if(i>greatestExpense){
                greatestExpense=i;
            }
        }
        System.out.println("The greatest expense is: " + greatestExpense);

        int cheapestSpending= Integer.MAX_VALUE;
        for (Integer i : numbers) {
            if(i<cheapestSpending){
                cheapestSpending=i;
            }
        }
        System.out.println("The cheapest spending is: " + cheapestSpending);

        System.out.println("The average amout of spendig is: " + (double)sum/numbers.size());


    }


}

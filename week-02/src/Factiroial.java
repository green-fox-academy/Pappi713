import java.util.Scanner;

public class Factiroial {
    public static void main(String[] args) {
        //  Create the usual class wrapper
        //  and main method on your own.

        // - Create a function called `factorio`
        //   that returns it's input's factorial

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the number whit it you want me to count!");
        int number=scanner.nextInt();
        System.out.println("The factoril of the numbers is: " + factorio(number));
    }

    public static int factorio(int number){
        int fact=1;

        for (int i=1;i<=number;i++){
            fact =fact*i;
        }
        return fact;
    }
}

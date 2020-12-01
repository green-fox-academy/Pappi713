import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int number2 = scanner.nextInt();
        try {
            System.out.println(dividebyvalue(number, number2));
        } catch (ArithmeticException er) {
            System.out.println("FAIL!");
        }

    }


    public static int dividebyvalue(int number, int divider) {
        return number / divider;
    }
}

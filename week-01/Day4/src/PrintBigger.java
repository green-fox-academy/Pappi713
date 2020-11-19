import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one
        System.out.println("Give me two numbers please!");
        Scanner scanner=new Scanner(System.in);

        int num1=scanner.nextInt();
        int num2=scanner.nextInt();

        if (num1>num2){
            System.out.println(num1);
        }
        else if (num1<num2){
            System.out.println(num2);
        }
        else System.out.println("The two numbers are equal!");
    }
}

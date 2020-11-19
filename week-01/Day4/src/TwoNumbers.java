public class TwoNumbers {
    public static void main(String[] args) {

        int a = 22;
        int b = 13;

        int sum;
        int sub;
        int mult;
        double div;
        int div2;
        int mod;

        sum = a + b;
        sub = a - b;
        mult = a * b;
        div = (double) a / b;
        div2 = a / b;
        mod=a%b;



        System.out.println();
        // Create a program that prints a few operations on two numbers: 22 and 13

        // Print the result of 13 added to 22
        System.out.println(sum);
        // Print the result of 13 substracted from 22
        System.out.println(sub);
        // Print the result of 22 multiplied by 13
        System.out.println(mult);
        // Print the result of 22 divided by 13 (as a decimal fraction)
        System.out.println(div);
        // Print the integer part of 22 divided by 13
        System.out.println(div2);
        // Print the remainder of 22 divided by 13
        System.out.println(mod);
    }
}

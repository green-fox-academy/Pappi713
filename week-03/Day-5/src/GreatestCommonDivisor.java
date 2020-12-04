public class GreatestCommonDivisor {
    public static void main(String[] args) {
        // Find the greatest common divisor of two numbers using recursion.
        int number1=49;
        int number2=21;
        System.out.println("The biggest divider is: "+divider(number1,number2,Math.max(number1,number2)));
    }

    public static int divider(int x, int y, int n){
        if(n==1){
            return 1;
        }
        if (x%n==0 && y%n==0) {
            return n;
        }
        return divider(x,y,n-1);
    }
}

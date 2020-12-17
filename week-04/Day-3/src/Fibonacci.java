public class Fibonacci {

    public  int fibo(int number) {
        if(number<0){
            throw new IllegalArgumentException();
        }
        if (number == 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        return fibo(number - 1) + fibo(number - 2);
    }


}

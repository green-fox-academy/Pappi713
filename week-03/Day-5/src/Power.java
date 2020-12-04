public class Power {
    public static void main(String[] args) {
        System.out.println(squared(5,3));
    }

    public static int squared(int base, int n){

        if (n==1){
            return base;
        }
        return base* squared(base,n-1);
    }



}

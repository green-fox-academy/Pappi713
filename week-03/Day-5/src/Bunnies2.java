public class Bunnies2 {
    public static void main(String[] args) {
        System.out.println(bunnyEars2(45));
    }

    public static int bunnyEars2(int bunnies){
        if(bunnies==0){
            return 0;
        }
        if (bunnies%2==1){
            return 2+bunnyEars2(bunnies-1);
        }
        else{
            return 3+bunnyEars2(bunnies-1);
        }
    }
}

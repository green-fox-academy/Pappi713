public class Bunnies {
    public static void main(String[] args) {
        // We have a number of bunnies and each bunny has two big floppy ears.
        // We want to compute the total number of ears
        // across all the bunnies recursively (without loops or multiplication).


        System.out.println(bunnyEarsCounter(9));
    }

    public static int bunnyEarsCounter(int bunnies) {
        if (bunnies == 0) {
            return 0;
        }
        return 2+bunnyEarsCounter(bunnies-1);

    }

}

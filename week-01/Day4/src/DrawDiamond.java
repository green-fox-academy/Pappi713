public class DrawDiamond {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // diamond like this:
        //
        //
        //    *
        //   ***
        //  *****
        // *******
        //  *****
        //   ***
        //    *
        //
        // The diamond should have as many lines as the number was


        //rn its a draw Piramid code
        int rows = 7;
        int k = 0;
        int nxt = 0;
        /*System.out.println("Plox gimme the size of the piramid!!!");
        Scanner scanner = new Scanner(System.in);
        rows = scanner.nextInt();*/
        for (int i = 1; i <= rows; i++, k = 0) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
            }
            while (k != 2 * i - 1) {
                System.out.print("* ");
                k++;
                nxt = k-1;
            }
            System.out.println("");
        }
        for (int l = 1; l <= rows -1; l++, k = 0) {
            ;
            for (int n = 1; n <= l; n++) {
                System.out.print("  ");
            }
            while (k <= nxt - 2) {
                System.out.print("* ");
                k++;
            }
            System.out.println("");
            nxt-=2;

        }

    }
}

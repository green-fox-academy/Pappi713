import java.lang.Math;

public class VariableMutation {
    public static void main(String[] args) {
        int a = 3;
        // make the "a" variable's value bigger by 10
        a += 10;
        System.out.println(a);

        int b = 100;
        // make b smaller by 7
        b -= 7;

        System.out.println(b);

        int c = 44;
        // please double c's value
        c *= c;

        System.out.println(c);

        int d = 125;
        // please divide by 5 d's value
        d /= 5;
        System.out.println(d);

        int e = 8;
        // please cube of e's value
        e = e * e;

        System.out.println(e);

        int f1 = 123;
        int f2 = 345;
        boolean bigger;
        // tell if f1 is bigger than f2 (print as a boolean)
        if (f1 > f2) {
            bigger = true;
        } else bigger = false;
        System.out.println("f1 is bigger than f2: " + bigger);

        int g1 = 350;
        int g2 = 200;
        // tell if the double of g2 is bigger than g1 (print as a boolean)
        if (g1 > g2) {
            bigger = true;
        } else bigger = false;
        System.out.println("g1 is bigger than g2: " + bigger);

        int h = 135798745;
        boolean isDivisor;
        // tell if it has 11 as a divisor (print as a boolean)
        if (h % 11 == 0) {
            isDivisor = true;
        } else isDivisor = false;
        System.out.println("11 is a divisor: " + isDivisor);

        int i1 = 10;
        int i2 = 3;
        boolean goodboi;
        // tell if i1 is higher than i2 squared and smaller than i2 cubed (print as a boolean)
        double squared;
        double cubed;

        squared = Math.pow(i2, 2);
        cubed = Math.pow(i2, 3);
        if (i1 > squared && i1 < cubed) {
            goodboi = true;
        } else goodboi = false;
        System.out.println(goodboi);

        int j = 1521;
        boolean dividable;
        // tell if j is dividable by 3 or 5 (print as a boolean)
        if (j % 3 == 0 || j % 5 == 0) {
            dividable=true;
        }
        else dividable=false;
        System.out.println(dividable);
    }
}

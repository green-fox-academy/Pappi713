import java.lang.reflect.Array;
import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        // - Create (dynamically*) a two dimensional array
        //   with the following matrix**. Use a loop!
        //
        //   1 0 0 0
        //   0 1 0 0
        //   0 0 1 0
        //   0 0 0 1
        //
        // - Print this two dimensional array to the output
        // * length should depend on a variable
        // ** Relax, a matrix is just like an array

        int size = 4;
        for (int i = 0; i < size; i++) {
            int[] myArray = new int[4];
            myArray[i] = 1;
            System.out.println(Arrays.toString(myArray));
        }
    }
}

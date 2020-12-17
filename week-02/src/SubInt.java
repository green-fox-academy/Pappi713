import java.security.KeyStore;
import java.util.Arrays;

public class SubInt {
    public static void main(String[] args) {
        //  Create a function that takes a number and an array of integers as a parameter
        //  Returns the indices of the integers in the array of which the first number is a part of
        //  Or returns an empty array if the number is not part of any of the integers in the array

        //  Example:
        //System.out.println(Arrays.toString(subInt(1, new int[]{1, 11, 34, 52, 61})));
        //  should print: `[0, 1, 4]`
        //System.out.println(Arrays.toString(subInt(9, new int[]{1, 11, 34, 52, 61})));
        //  should print: '[]'

        // Note: We are using Arrays.toString() function as a way to print
        // array returned from subInt(). You could just as well iterate over array to print it.



        int[] Array={1,11,34,52,61};
        int number=1;
        System.out.println(Arrays.toString(Subint(new int[] {1, 11, 34, 11, 52, 61, 1, 34}, number)));
    }

    public static int[] Subint(int[] array, int number) {
        int arraysize = 0;
        for (int i = 0; i < array.length; i++) {

            if (String.valueOf(array[i]).indexOf(String.valueOf(number)) >=0) {
                arraysize++;
            }
        }
        int[] returnArray = new int[arraysize];
        int returPosCounter =0;
        for (int j = 0; j < array.length; j++) {
            if (String.valueOf(array[j]).indexOf(String.valueOf(number)) >=0){
                returnArray[returPosCounter]=array[j];
                returPosCounter++;
            }
        }
        return returnArray;
    }
}
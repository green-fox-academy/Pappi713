import java.util.Arrays;

public class ReverseList {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
        //   with the following content: `[3, 4, 5, 6, 7]`
        // - Reverse the order of the elements in `numbers`
        // - Print the elements of the reversed `numbers`

        int[] numbers = {3, 4, 5, 6, 7};
        int[] revNumbers = numbers.clone();
        //System.out.println(Arrays.toString(revNumbers));
        int numLength = numbers.length;

        for (int i = 0; i < numLength; i++) {
            revNumbers[numLength - 1 - i] = numbers[i];
        }
        //System.out.println(Arrays.toString(revNumbers));
        numbers = revNumbers.clone();
        System.out.println(Arrays.toString(numbers));

    }
}

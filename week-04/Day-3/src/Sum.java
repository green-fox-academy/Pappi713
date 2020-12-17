public class Sum {

    public int sumOfArrayElements(int[] array) {
        if (array == null) {
            throw new NullPointerException();
        }
        int sum = 0;
        for (int i : array) {
            sum = sum + i;
        }
        return sum;
    }
}


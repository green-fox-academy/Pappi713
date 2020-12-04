public class Maximum {
    public static void main(String[] args) {
        // Write a function that finds the largest element of an array using recursion.
        int[] a = {1, 2, 3, 4};
        int n =a.length;
        System.out.println(maxValue(a,n-1));

    }

    public static int maxValue(int[] array, int n){
            if (n>0) {
                return Math.max(array[n], maxValue(array, n-1));
            } else {
                return array[0];
            }
        }
    }


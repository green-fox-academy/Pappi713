import java.util.Arrays;
import java.util.List;


public class Extension {
    int add(int a, int b) {
        return a+b;
    }

    int maxOfThree(int a, int b, int c) {
        int[] array={a,b,c};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        return max;
    }

    int median(List<Integer> pool) {
        if (pool.size()%2==0){
            return ((pool.get(pool.size()/2)+(pool.get(pool.size()/2+1))))/2;
        }
        else{
            return pool.get(((int)pool.size()/2));
        }
    }

    boolean isVowel(char c) {
        return Arrays.asList('a', 'u', 'o', 'e', 'i').contains(c);
    }

    String translate(String hungarian) {
        String teve = hungarian;
        int length = teve.length();
        for (int i = 0; i < length; i++) {
            char c = teve.charAt(i);
            if (isVowel(c)) {
                teve = String.join(c + "v" + c, teve.split(""+c));
                i+=2;
                length+=2;
            }
        }
        return teve;
    }
}

// Check out the folder. There's a work file and a test file.

//  -  Run the tests, all 10 should be green (passing).
//  -  The implementations though are not quite good.
//  -  Create tests that'll fail, and will show how the implementations are wrong(You can assume that the implementation of join and split are good)
//  -  After creating the tests, fix the implementations
//  -  Check again, if you can create failing tests
//  -  Implement if needed

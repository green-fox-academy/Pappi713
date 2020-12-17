import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once

        //  Example
        //System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`
        System.out.println(Arrays.toString(unique(new int[]{1, 11, 34, 11, 52, 61, 1, 34})));
    }
//Well... i solved an other problem where i removed all the items which are duplicated.... Its not good but bad so Im a bit unhappy now

    public static int[] unique(int[] Array) {
        int[] newArray= new int[Array.length];
        int isMatch;
        int newArraySize=0;
        for(int i=0;i<Array.length;i++){
            isMatch=0;
            for(int j=0;j<Array.length;j++){
                if(Array[j]== Array[i]){
                    isMatch++;
                }
            }
            if(isMatch<2){
                newArray[newArraySize]=Array[i];
                newArraySize++;
            }
        }
        return newArray;
    }
}

import java.util.Arrays;

public class Anagram {

    public Boolean stringLengthCompareble(String str1, String str2){
        if(str1.length()==str2.length()){
            return true;
        }
        else {
            return false;
        }
    }

    public Boolean IsAnagram(String str1, String str2){
        if(stringLengthCompareble(str1,str2)){
            char[] a1 = str1.toCharArray();
            char[] a2 = str2.toCharArray();
            Arrays.sort(a1);
            Arrays.sort(a2);
            return Arrays.equals(a1, a2);
        }
        return false;
    }
}

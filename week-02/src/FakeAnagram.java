import java.util.Arrays;

public class FakeAnagram {
    public static void main(String[] args) {
        //Create a function named isAnagram following your current language's style guide.
        //It should take two strings and return a boolean value depending on whether its an anagram or not.

        String strBase = "dog";
        String strAnag = "god";

        System.out.println(anagram(strBase, strAnag));


    }

    public static boolean anagram(String start, String end) {
        boolean isAnagram = true;

        int startLength = start.length();
        int endLength = end.length();
        if (startLength != endLength) return false;

        String[] startStringArray = new String[startLength];
        String[] endStringArray = new String[endLength];

        for (int i = 0; i < start.length(); i++) {
            startStringArray[i] = start.substring(i, i + 1);
        }
        for (int i = 0; i < end.length(); i++) {
            endStringArray[i] = end.substring(i, i + 1);
        }

        System.out.println(Arrays.toString(startStringArray));
        System.out.println(Arrays.toString(endStringArray));

        for (int i = 0; i < startStringArray.length; i++) {
            if (!startStringArray[i].equals(endStringArray[endLength-1-i])) {
                isAnagram = false;
            }
        }
        return isAnagram;

    }

}

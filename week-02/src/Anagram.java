import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        //Create a function named isAnagram following your current language's style guide.
        //It should take two strings and return a boolean value depending on whether its an anagram or not.

        String strBase = "doga";
        String strAnag = "goda";
        System.out.println(anagram(strBase, strAnag));


    }

    public static boolean anagram(String start, String end) {
        boolean isAnagram = true;
        //Creating sorted char array
        char[] startArray = start.toCharArray();
        Arrays.sort(startArray);
        String sortedStart = new String(startArray);

        char[] endArray = end.toCharArray();
        Arrays.sort(endArray);
        String sortedEnd = new String(endArray);


        System.out.println(sortedStart);
        System.out.println(sortedEnd);

        int[] startQuant = new int[start.length()];
        int[] endQuant = new int[start.length()];

        if (startArray.length != endArray.length) return false;

        if (!sortedEnd.equals(sortedStart)) return false;

        else return true;
    }

}

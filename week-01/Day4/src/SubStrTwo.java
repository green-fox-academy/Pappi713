import java.util.Scanner;
import java.io.*;

public class SubStrTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        /*System.out.println("What you want to search?");
        String sub = scanner.next();
        System.out.println("Where you want to search it?");
        String str = scanner.next();*/

        System.out.println(subStr("", "a"));


    }

    public static int subStr(String input, String q) {
        //String substring(int beginIndex, int endIndex)
        //operation.equals("q")
        int strLength = input.length();
        int subLength = q.length();
        int sStart;
        int sEnd;
        int poz=0;
        boolean isMatch = false;
        for (int i = 0; i <= strLength - subLength; i++) {
            if (q.equals(input.substring(i , i + subLength ))) {
                isMatch = true;
                poz = i + 1;
            }
        }
        if (isMatch == true) {
            return poz;
        }
        else return -1;
    }
}

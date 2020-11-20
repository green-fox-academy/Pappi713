import java.util.Scanner;

public class SubStr {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What you want to search?");
        String sub = scanner.next();

        System.out.println("Where you want to search it?");
        String str = scanner.next();

        System.out.println(subStr(str,sub));

    }

    public static int subStr(String input, String q) {

        int position = input.indexOf(q);
        if(position>0){
            position=position+1;
        }
        return position;
    }
}



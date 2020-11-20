import java.util.Scanner;

public class DrawSquare {
    public static void main(String[] args) {
        // Write a program that reads a number from the standard input, then draws a
        // square like this:
        //
        //
        // %%%%%
        // %   %
        // %   %
        // %   %
        // %%%%%
        //
        // The square should have as many lines as the number was
        Scanner scanner=new Scanner(System.in);
        System.out.println("Gimme the size!");
        int size=scanner.nextInt();

        for(int i=1;i<=size;i++){
            for(int j=1;j<=size;j++){
                if (i==1 || i==size || j==1 || j==size){
                    System.out.print("%");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}

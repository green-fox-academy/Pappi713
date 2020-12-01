import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class TicTacToe {

    public static void main(String[] args) {
        // Write a function that takes a filename as a parameter
        // The file contains an ended Tic-Tac-Toe match
        // We have provided you some example files (draw.txt, win-x.txt, win-o.txt)
        // Return "X", "O" or "Draw" based on the input file

        System.out.println(ticTacResult("win-o.txt"));
        // Should print "O"

        //System.out.println(ticTacResult("win-x.txt"));
        // Should print "X"

        //System.out.println(ticTacResult("draw.txt"));
        // Should print "Draw"
    }

    public static String ticTacResult(String filename){
        String[][] map=new String[3][3];
        String winner="";
        String draw="";
        try{
            List<String> lines = Files.readAllLines(Paths.get(filename));
            for (int i=0;i<lines.size();i++){
                map[i][0]= String.valueOf(lines.get(i).charAt(0));
                map[i][1]= String.valueOf(lines.get(i).charAt(1));
                map[i][2]= String.valueOf(lines.get(i).charAt(2));
            }
            System.out.println(Arrays.deepToString(map));

        }
        catch (IOException ex){
            System.out.println("Error during the file opening process");
        }
        return null;
    }
}

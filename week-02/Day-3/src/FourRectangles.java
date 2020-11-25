import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FourRectangles {

    public static void mainDraw(Graphics graphics){
        // draw four different size and color rectangles.
        // avoid code duplication.
        Scanner scanner=new Scanner(System.in);
        List<Color> colors=new ArrayList<Color>();
        colors.addAll(Arrays.asList(new Color[]{Color.RED, Color.PINK, Color.GREEN, Color.BLUE}));


       for(int i=0;i<4;i++){
           System.out.println("Give me the parameters of the square you want to draw");
           graphics.setColor(colors.get(i));
            drawActual(graphics,scanner.nextInt(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
        }
    }
    public static void drawActual(Graphics g, int xPos, int yPos, int width, int heigth){
        g.fillRect(xPos,yPos,width,heigth);
    }
    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}

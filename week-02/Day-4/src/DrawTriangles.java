import javax.swing.*;

import java.awt.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class DrawTriangles {
    public static void mainDraw(Graphics graphics) {
        //draw Triangles within triangles
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me the number how many triangles ou want to represent!");
        //variables used in the base program
        int maxTriangleInARow = scanner.nextInt();
        int xPos = 50;
        int xPosStart = xPos;
        int yPos = 300;
        int yNewLine = 0;
        int sizeOfTriangle = 50;
        //Xpansion
        int XposBorderTriangle =xPos;
        int YposBorderTriangle =yPos;
        int borderTriangleSize =sizeOfTriangle*maxTriangleInARow;
        drawactual(graphics,XposBorderTriangle,YposBorderTriangle,borderTriangleSize);
        for (int i = maxTriangleInARow; i >= 0; i--) {
            for (int j = 1; j <= i; j++) {
                yNewLine = drawactual(graphics, xPos, yPos, sizeOfTriangle);
                xPos += sizeOfTriangle;
            }
            xPosStart += sizeOfTriangle / 2;
            xPos = xPosStart;
            yPos = yNewLine;
        }


    }

    //here we draw a single tringle
    public static int drawactual(Graphics graphics, int xPos, int yPos, int size) {
        int sizeOfTriangle = size;
        double hG = Math.sqrt(Math.pow(sizeOfTriangle, 2) - Math.pow(sizeOfTriangle / 2, 2));
        //double yPos3 = 400-Math.sqrt(Math.pow(sizeOfTriangle,2)-Math.pow(sizeOfTriangle/2,2))-yPos;
        int[][] dots = {
                {xPos, xPos + sizeOfTriangle, xPos + sizeOfTriangle / 2},
                {yPos, yPos, yPos - (int) hG},
        };
        Random rnd = new Random();
        int r = rnd.nextInt(256);
        int g = rnd.nextInt(256);
        int b = rnd.nextInt(256);
        Color rgb = new Color(r, g, b);
        graphics.setColor(rgb);
        graphics.fillPolygon(dots[0], dots[1], 3);
        return dots[1][2];
    }

    // Don't touch the code below
    static int WIDTH = 600;
    static int HEIGHT = 600;

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

import javax.swing.*;

import java.awt.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
//WIP
public class SuperHexagon {
    public static void mainDraw(Graphics graphics) {
        //draw a Super Hexagon;

    }

    //here we draw a single tringle
    public static void drawactual(Graphics g,int xPos,int yPos){
        //draw a single hexagon
        int sizeOfTriangle=20;
        double radius = Math.sqrt(Math.pow(sizeOfTriangle, 2) - Math.pow(sizeOfTriangle / 2, 2));
        int[][] dots = {
                {xPos, xPos + sizeOfTriangle, xPos + sizeOfTriangle / 2},
                {yPos, yPos, yPos - (int) radius},
        };

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

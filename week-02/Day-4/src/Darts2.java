import javax.swing.*;

import java.awt.*;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

//WIP
public class Darts2 {
    public static void mainDraw(Graphics graphics) {
        int xPos = 300;
        int yPos = 300;
        int tableRadius = 300;
        int singleBullRadius = 50;
        int bullRadius = 25;
        //draw the table
        graphics.setColor(Color.black);
        drawcircle(graphics, xPos, yPos, tableRadius);
        //draw Final bullshit
        finalbullshit(graphics);
        //draw single bull;
        graphics.setColor(Color.GREEN);
        drawcircle(graphics, xPos, yPos, singleBullRadius);
        //draw Bull;
        graphics.setColor(Color.RED);
        drawcircle(graphics, xPos, yPos, bullRadius);
        //draw the circle lines
        drawlines(graphics);
    }

    private static void finalbullshit(Graphics graphics ) {
        int startAngleB=9;
        int startAngleW=27;
        int step=18;
        for(int i=1; i<=10;i++){
            createbullsit(graphics,Color.RED, Color.black,startAngleB);
            createbullsit(graphics,Color.GREEN, Color.WHITE,startAngleW);
            startAngleB+=step*2;
            startAngleW+=step*2;
        }
    }

    //function which fill the sectors with different colors
    public static void finishmasterpiece(){

    }

    //function which generates the circle lines
    private static void drawlines(Graphics graphics) {
        graphics.setColor(Color.BLUE);
        drawarc(graphics, 20, 20, 0, 360);
        drawarc(graphics, 0, 0, 0, 360);
        drawarc(graphics, 150, 150, 0, 360);
        drawarc(graphics, 175, 175, 0, 360);
        drawarc(graphics, 250, 250, 0, 360);
        drawarc(graphics, 275, 275, 0, 360);
    }

    public static void drawsectors(Graphics graphics, int currentPos){
        graphics.setColor(Color.white);
        int sectorsize=18;
        for (int i=1; i<=20;i++){
            fillarc(graphics,0,0,currentPos,sectorsize);
            currentPos=currentPos+2*sectorsize;
        }
    }
    //function to generate a singe circle
    public static void drawcircle(Graphics g, int xPos, int yPos, int radius) {
        int diameter = radius * 2;

        //shift x and y by the radius of the circle in order to correctly center it
        g.fillOval(xPos - radius, yPos - radius, diameter, diameter);
    }
    // function to generte a single cricle line
    public static void drawarc(Graphics g, int xPos, int yPos, int startAngle, int arcAngle) {

        int width = WIDTH - 2 * xPos;
        int length = HEIGHT - 2 * yPos;
        int angle = startAngle;
        //shift x and y by the radius of the circle in order to correctly center it
        g.drawArc(xPos, yPos, width, length, angle, arcAngle);
    }
    //function to generate a fillerd arc
    public static void fillarc(Graphics g, int xPos, int yPos, int startAngle, int arcAngle) {
        int width = WIDTH - 2 * xPos;
        int length = HEIGHT - 2 * yPos;
        int angle = startAngle;
        //shift x and y by the radius of the circle in order to correctly center it
        g.fillArc(xPos, yPos, width, length, angle, arcAngle);
    }
    //fumction to generate a something cool
    public static void fillarc2(Graphics g, int xPos, int yPos, int startAngle ,int arcAngle, Color c){
        int width = WIDTH - 2 * xPos;
        int length = HEIGHT - 2 * yPos;
        int angle = startAngle;
        g.setColor(c);
        g.fillArc(xPos, yPos, width, length, angle, arcAngle);
    }
    public static void createbullsit(Graphics g, Color c1, Color c2, int startAngle){
        fillarc2(g,0,0,startAngle,18,c1);
        fillarc2(g,20,20,startAngle,18,c2);
        fillarc2(g,150,150,startAngle,18,c1);
        fillarc2(g,175,175,startAngle,18,c2);
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



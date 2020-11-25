import javax.swing.*;

import java.awt.*;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Draw at least 3 lines with that function using a loop.
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            drawActual(graphics, scanner.nextInt(), scanner.nextInt());
        }

    }

    public static void drawActual(Graphics g, int xPos, int yPos) {
        int xCenter = WIDTH / 2;
        int yCenter = HEIGHT / 2;
        g.drawLine(xPos, yPos, xCenter, yCenter);
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
            Scanner scanner = new Scanner(System.in);
            System.out.println("The draw panel is 320*320, please give a starting points within the panel!");

            mainDraw(graphics);
        }
    }
}


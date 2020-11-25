import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        int xPos = 0;
        int yPos = 0;
        int d = 20;
        graphics.setColor(Color.GREEN);
        graphics.fillRect(0, 0, 320, 320);
        graphics.setColor(Color.black);
        for (int i = 0; i <= (HEIGHT / d) + 1; i++) {
            for (int j = 0; j <= WIDTH / d; j++) {
                if ((xPos >= 0 && yPos == 0) || (xPos == 0 && yPos >= 0) || (xPos == WIDTH && yPos >= 0) || (xPos >= 0 && yPos == HEIGHT)) {
                    drawactual(graphics, xPos, yPos);
                    //if (xPos == WIDTH && yPos >= 0) System.out.println("kismacska"); DEBUGER
                }
                xPos = xPos + d;
            }
            xPos = 0;
            yPos = 0 + i * d;
        }
    }

    public static void drawactual(Graphics g, int xPos, int yPos) {
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
            mainDraw(graphics);
        }
    }
}

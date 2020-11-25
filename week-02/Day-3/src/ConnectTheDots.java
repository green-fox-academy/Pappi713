import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 2 parameters:
        // An array of {x, y} points and graphics
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}}
        int[][] dots= {
                {10,10},
                {290,10},
                {290,290},
                {10,290}
        };
        int[][] dots2= {
                {50, 100},
                {70, 70},
                {80, 90},
                {90, 90},
                {100, 70},
                {120, 100},
                {85, 130},
                {50, 100}
        };
        drawactual(graphics, dots);
        drawactual(graphics, dots2);
    }

    private static void drawactual(Graphics graphics, int[][] dots) {
        graphics.setColor(Color.GREEN);
        for(int i = 0; i< dots.length-1; i++){
            graphics.drawLine(dots[i][0], dots[i][1], dots[i+1][0], dots[i+1][1]);
        }
        graphics.drawLine(dots[dots.length-1][0], dots[dots.length-1][1], dots[0][0], dots[0][0]);
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

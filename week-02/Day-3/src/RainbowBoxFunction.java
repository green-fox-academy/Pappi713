import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).
        List<Color> colors = new ArrayList<Color>();
        Color Indigo = new Color(75, 0, 130);
        Color Violet = new Color(238, 130, 238);
            colors.addAll(Arrays.asList(new Color[]{Color.RED, Color.ORANGE, Color.YELLOW, Color.BLUE, Indigo, Violet}));
        int colorSize = colors.size();
//        System.out.println(colorSize);
//        System.out.println(colors);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < colorSize; i++) {
            System.out.println("Give me a size of the new square. It should be smaller than the previous");
            actualdraw(graphics, scanner.nextInt(), colors.get(i));
        }

    }

    public static void actualdraw(Graphics g, int size, Color color) {
        int xCenter = WIDTH / 2;
        int yCenter = HEIGHT / 2;
        g.setColor(color);
        g.fillRect(xCenter - size / 2, yCenter - size / 2, size, size);

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

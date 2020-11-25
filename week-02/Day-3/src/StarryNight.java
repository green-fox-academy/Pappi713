import javax.swing.*;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)
        int starsize = 10;
        Random rnd = new Random();
        ArrayList<Integer> shadeOfGrey = new ArrayList<>();
        shadeOfGrey.addAll(Arrays.asList(new Integer[]{128, 136, 144, 152, 160, 168,169,176,184}));
        System.out.println(shadeOfGrey.size());
        int numberOfStars = 10;
        int shade;

        for (int i = 0; i < numberOfStars; i++) {
            shade = (int) ((Math.random() * (shadeOfGrey.size() - 1)) + 1);
            System.out.println(shade);
            Color rgb = new Color(shadeOfGrey.get(shade), shadeOfGrey.get(shade), shadeOfGrey.get(shade));
            graphics.setColor(rgb);
            graphics.fillRect(rnd.nextInt(WIDTH - 10), rnd.nextInt(HEIGHT - 10), starsize, starsize);
        }
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
            this.setBackground(Color.black);
            mainDraw(graphics);
        }
    }
}

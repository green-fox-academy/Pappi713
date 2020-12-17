
import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class WarMapWithMap {
    int sizeOfArmada = 5;
    Armada armada1 = new Armada(sizeOfArmada);
    Armada armada2 = new Armada(sizeOfArmada);


    public static void mainDraw(Graphics graphics) {
        WarMapWithMap wm = new WarMapWithMap();
        // draw a red horizontal line to the canvas' middle.
        // draw a green vertical line to the canvas' middle.
        boolean warResult = (wm.armada1.war(wm.armada2));
        if (warResult) {
            System.out.println("The first armada won this colossal battle!!!");
        } else {
            System.out.println("The second armada won this colossal battle!!!");
        }
        //draw Ocean
        graphics.setColor(Color.BLUE);
        graphics.fillRect(0, 0, WIDTH, HEIGHT);
        graphics.setColor(Color.black);


        //draw first armada
        int xPosArmada1 = 50;
        int yPosArmada1 = 20;
        drawAmada(graphics, xPosArmada1, yPosArmada1, wm.sizeOfArmada);

        //draw second armada
        int xPosArmada2 = 200;
        int yPosArmada2 = 20;
        drawAmada(graphics, xPosArmada2, yPosArmada2, wm.sizeOfArmada);
    }


    public static void drawAmada(Graphics g, int xPos, int yPos, int sizeOfArmada) {
        int x = xPos;
        int y = yPos;
        for (int i = 0; i < sizeOfArmada; i++) {
            g.fillRect(x, y, 30, 70);
            g.setColor(Color.red);
            g.drawString("SH" + (i + 1), x + 3, y + 37);
            g.setColor(Color.black);
            y = y + 75;

        }
    }

    // Don't touch the code below
    static int WIDTH = 300;
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
            //setBackground(Color.cyan);
            mainDraw(graphics);

        }
    }
}

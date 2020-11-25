import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        int squaresOnBoard = 8;
        int squareSize = WIDTH / 8;
        boolean isBlack = true;
        int xPos=0;
        int yPos=0;
        for (int i = 1; i <= squaresOnBoard; i++) {
            for (int j = 1; j <= squaresOnBoard; j++) {
                if(isBlack){
                    graphics.setColor(Color.black);
                    graphics.fillRect(xPos,yPos,squareSize,squareSize);
                    isBlack =!isBlack;
                    xPos=0+ j*squareSize;
                    yPos=0+(i-1)*squareSize;
                }
                else{
                    graphics.setColor(Color.WHITE);
                    graphics.fillRect(xPos,yPos,squareSize,squareSize);
                    isBlack =!isBlack;
                    xPos=0+j*squareSize;
                    yPos=0+(i-1)*squareSize;
                }
            }
            xPos=0;
            yPos=0+i*squareSize;
            isBlack=!isBlack;
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
            mainDraw(graphics);
        }
    }
}

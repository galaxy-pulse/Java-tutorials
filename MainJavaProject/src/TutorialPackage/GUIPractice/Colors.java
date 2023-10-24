package GUIPractice;

import java.awt.*;
import javax.swing.*;

public class Colors extends JPanel{
JFrame frame;

Color brightYellow = new Color (240,253,2);
Color darkGreen = new Color (28,89,71);

public void fireUpScreen() {

    frame = new JFrame () ;
    frame.setVisible(true);
    frame.setSize(400, 400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(this);

}

public void paintComponent (Graphics g) {

    Graphics2D g2d = (Graphics2D) g;
    g2d.setColor(darkGreen);
    g2d.fillRect(0, 0, 200, 100);
    g2d.setColor(brightYellow);
    g2d.drawString("This is a test.", 5, 10);

}

public static void main(String[] args) {
    
    Colors go = new Colors();
    go.fireUpScreen();

}

    
}

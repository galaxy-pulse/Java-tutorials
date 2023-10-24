package GUIPractice;

import java.awt.*;
import javax.swing.*;

//More Gui practice -- practicing with graphics 
//To create graphics, we can't use the JFrame interface. We MUST USE the JPanel interface instead.
//But we still use JFrame to make our window. 

public class Rectangle extends JPanel{
JFrame frame;

    public void fireUpScreen() {

        frame = new JFrame () ;
        frame.setVisible(true);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(this);

    }

public void paintComponent (Graphics g) {

    //printComponent is the method used to paint -- think of JPanel as our canvas

   /* g.setColor(Color.BLUE);
    g.fillRect(0, 0, 200, 100); */

}

    public static void main(String[] args) {
        
        Rectangle go = new Rectangle();
        go.fireUpScreen();

    }
    
}

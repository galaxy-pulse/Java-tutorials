package GUIPractice;

import javax.swing.*;                                                   //We are accessing Java Swing

public class Gui {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame ();                                   //Creating "frame" object
        JButton button = new JButton("Submit");                    //Creating "button" object

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);           //This will close the window and stop the program

        frame.add(button);                                              //Adds the button TO the frame

        frame.setSize(400, 400);                           //Set the size

        frame.setVisible(true);                                       //Set the visibility to true to make it visible

        frame.setLocationRelativeTo(null);

    }

}

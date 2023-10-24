package GUIPractice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class KeyListenerTutorial extends JFrame implements KeyListener{

    JTextField keyText = new JTextField(80);
    JLabel keyLabel = new JLabel("Press fire button");

    KeyListenerTutorial () {

        keyText.addKeyListener(this);
        setSize(400, 400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BorderLayout layout = new BorderLayout();                   //Layout managers - let you place components where you want them
        setLayout(layout);
        add(keyLabel, BorderLayout.NORTH);
        add(keyText, BorderLayout.CENTER);
    }

    public void keyTyped (KeyEvent e) {

        //Won't be using this

    }

    public void keyPressed (KeyEvent e) {

        int keyCode = e.getKeyCode();               //Every key on your board has a code - this pulls that code 
            if (keyCode == KeyEvent.VK_F) {         //Get the code for the "F" key, and if this button is pressed, say this

                keyLabel.setText("You pressed the fire button.");

            }

            else {

                keyLabel.setText("You pressed the wrong key.");

            }


        

    }

    public void keyReleased (KeyEvent txt) {

        //Won't be using this 

    }

    public static void main(String[] args) {
        
        //KeyListenerTutorial go = new KeyListenerTutorial();

    }
}
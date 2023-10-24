package GUIPractice;

 import javax.swing.*;
 import java.awt.event.*;
    
public class ListenerEventsandInput implements ActionListener{
JButton button;

   public void createAndShowGui() {

    JFrame frame = new JFrame () ;

    button = new JButton ("Submit");

    button.addActionListener(this);

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.add(button);
    frame.setSize(400,400);
    frame.setVisible(true);
    frame.setLocationRelativeTo(null);

   }

   public void actionPerformed(ActionEvent event) {

    //System.out.println("Information has been submitted.");
    button.setText("Information has been submitted.");

   }

   public static void main(String[] args) {

    ListenerEventsandInput gui = new ListenerEventsandInput() ;
    gui.createAndShowGui () ;
    
   }

}

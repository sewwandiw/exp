package test5;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/24/13
 * 12:14 PM
 */
import javax.swing.*;
import java.awt.event.*;

public class Gui implements java.awt.event.ActionListener {
    JButton button;
   // JRadioButton radioButton;

    public static void main(String[] args) {
        Gui gui = new Gui();
        gui.go();
    }
   public  void go(){
       JFrame frame = new JFrame();
       button = new JButton("Click me");
     //  radioButton = new JRadioButton("OK");

       button.addActionListener(this);
       frame.getContentPane().add(button);
      // frame.getContentPane().add(radioButton);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(300,300);
       frame.setVisible(true);


    }

    public void actionPerformed(ActionEvent e) {
        button.setText("I have been clicked");
    }


}

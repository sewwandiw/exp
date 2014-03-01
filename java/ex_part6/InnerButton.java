package test5;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/26/13
 * 12:46 PM
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InnerButton {
    JFrame frame;
    JButton b;

    public static void main(String[] args) {
        InnerButton innerButton = new InnerButton();
        innerButton.go();
    }

    public void go(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        b = new JButton("CLICK ME");
        Font bigfont = new Font("Times new Roman",Font.BOLD,28);
        b.setFont(bigfont);
        b.addActionListener(new Blistner());
        frame.getContentPane().add(BorderLayout.EAST,b);
        frame.setSize(200,100);
        frame.setVisible(true);

    }

    class Blistner implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if (b.getText().equals("A")){
                b.setText("B");
            }
            else {
                b.setText("A");
            }
        }
    }

//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (b.getText().equals("A")){
//            b.setText("B");
//        }
//        else {
//            b.setText("A");
//        }
//    }
}

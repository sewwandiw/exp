package test5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/24/13
 * 7:05 PM
 */

public class TwoButtons{

    JLabel label;
    JFrame frame;
    JButton colorLabel;
    JButton  lableButton;

    public static void main(String[] args) {
        TwoButtons twoButtons = new TwoButtons();
        twoButtons.go();
    }

    public void go(){
        this.setUndecorated(true);
        frame =new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lableButton = new JButton("Change lable");
        lableButton.addActionListener(new LableListner());

        colorLabel = new JButton("Change circle");
        colorLabel.addActionListener(new ColorListner());

        label =new JLabel("I am a label");

        MyDrawPanel drawPanel = new MyDrawPanel();


        frame.getContentPane().add(BorderLayout.WEST, label);
        frame.getContentPane().add(BorderLayout.EAST,lableButton);
        frame.getContentPane().add(BorderLayout.SOUTH,colorLabel);
        frame.getContentPane().add(BorderLayout.CENTER,drawPanel);

        frame.setSize(700,700);
        frame.setVisible(true);


    }

    class LableListner implements ActionListener{
        public void actionPerformed(ActionEvent event) {
            lableButton.setText("Changed lable");
            label.setText("Ouch");

        }

    }

    class ColorListner implements ActionListener{
        public void actionPerformed(ActionEvent event){
            colorLabel.setText("Changed circle color");
           frame.repaint();
        }
    }

}

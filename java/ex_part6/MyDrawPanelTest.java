package test5;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/24/13
 * 12:51 PM
 */
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyDrawPanelTest implements ActionListener {
    JFrame frame;
//    JLabel label;
    JButton button;
    JButton label;



    public static void main(String[] args) {
        MyDrawPanelTest gui = new MyDrawPanelTest();
        gui.goGui();
    }
    public void goGui(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button = new JButton("Change colors");
        label = new JButton("Lable");
        button.addActionListener(this);
        label.addActionListener(this);

        MyDrawPanel drawPanel = new MyDrawPanel();

        frame.getContentPane().add(BorderLayout.SOUTH, button);
        frame.getContentPane().add(BorderLayout.WEST, label);
        frame.getContentPane().add(BorderLayout.CENTER, drawPanel);

        frame.setSize(700,700);
        frame.setVisible(true);


    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource()== button){
            button.setText("Changed color");
            frame.repaint();

        }
        else{
          label.setText("That hurts");
        }
    }
    }


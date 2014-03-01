package test5;

import javax.swing.*;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/24/13
 * 11:30 AM
 */

public class SimpleGui {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button1 = new JButton("Click me");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button1);
        frame.setSize(300,300);
        frame.setVisible(true);
    }
    public void changeIt(){

    }

}

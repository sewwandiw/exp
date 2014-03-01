package test5;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/26/13
 * 2:16 PM
 */
import javax.swing.*;
import java.awt.*;

public class Panel {
    public static void main(String[] args) {
        Panel panel = new Panel();
        panel.go();

    }

    public void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelA = new JPanel();
        JPanel panelB =new JPanel();

        JButton button = new JButton("Click me");
        JButton button1 = new JButton("Click me again");

        panelA.setLayout(new BoxLayout(panelA,BoxLayout.Y_AXIS));

        panelA.setBackground(Color.blue);
        panelB.setBackground(Color.red);

        panelA.add(button);
        panelA.add(button1);

       frame.setContentPane(panelA);
//        frame.getContentPane().add(BorderLayout.EAST, panelA);
//        frame.getContentPane().add(BorderLayout.WEST,panelB);
           frame.getContentPane().add(BorderLayout.EAST,button);
        frame.setSize(200,200);
        frame.setVisible(true);

    }
}

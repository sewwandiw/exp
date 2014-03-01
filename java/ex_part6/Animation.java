package test5;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 import javax.swing.*;
import java.awt.*;
/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/24/13
 * 8:19 PM
 */

public class Animation {
    JButton button;
    JFrame frame;
    int x = 150;
    int y = 120;

    static DrawPanelAnimation drawPanel =new DrawPanelAnimation();

    public static void main(String[] args) {
        Animation animation = new Animation();
        animation.go();
    }
    void go(){
       frame = new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        NewDrawPanel drawPanel = new NewDrawPanel();
        frame.getContentPane().add(drawPanel);
        frame.setSize(400,400);
        frame.setVisible(true);

        drawPanel.repaint();

        for (int i = 0 ; i <130 ;i++){

            y++;


            try {
                Thread.sleep(50);
                drawPanel.repaint();
            }
             catch (Exception ex){

             }

        }

    }

    class NewDrawPanel extends JPanel {

        public void paintComponent(Graphics graphics){
            graphics.setColor(Color.white);
            graphics.fillRect(0,0,this.getWidth(),this.getHeight());

            graphics.setColor(Color.cyan);
            graphics.fillOval(x,y,40,40);

        }

    }

}

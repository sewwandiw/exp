package test5;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/26/13
 * 1:16 PM
 */

import javax.swing.*;
import java.awt.*;

public class Animate {
    int x =1 ;
    int y = 1;

    public static void main(String[] args) {
        Animate animate = new Animate();
        animate.go();
    }

    private void go() {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawP myDrawP = new MyDrawP();
        frame.getContentPane().add(myDrawP);
        frame.setSize(500,270);
        frame.setVisible(true);
        for (int i = 0 ; i < 164 ;i++){
            x++;
            myDrawP.repaint();
            try {
                Thread.sleep(50);
            }
            catch (Exception ex){
                ex.printStackTrace();
            }
        }

    }

    public class MyDrawP extends JPanel {
        public void paintComponent (Graphics graphics){
            graphics.setColor(Color.white);
            graphics.fillRect(0,0,500,250);
            graphics.setColor(Color.blue);
            graphics.fillRect(x,y,500-x*2 ,250 -y*2);

        }
    }

}

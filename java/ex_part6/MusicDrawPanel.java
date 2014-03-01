package test5;

import javax.sound.midi.ControllerEventListener;
import javax.sound.midi.ShortMessage;
import javax.swing.*;
import java.awt.*;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/24/13
 * 10:37 PM
 */

public class MusicDrawPanel extends JPanel implements ControllerEventListener {
    boolean msg = false;
    public void controlChange(ShortMessage event){
        msg =true;
        repaint();
    }

    public void paintComponent(Graphics g){
        if (msg){

            Graphics2D g2g =(Graphics2D) g;

            int r =(int)(Math.random()*255);
            int b =(int)(Math.random()*255);
            int c =(int)(Math.random()*255);
            g.setColor(new Color(r,b,c));

            int x =(int)( (Math.random()*40)+10);
            int y =(int)(( Math.random()*40)+10);

            int ht =(int)((Math.random()*120)+10);
            int wd =(int)((Math.random()*120)+10);

            g.fillRect(x,y,wd,ht);
            msg =false;

        }
    }

}

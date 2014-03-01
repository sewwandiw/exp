package test5;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/24/13
 * 8:28 PM
 */

public class DrawPanelAnimation {

    private int x;
    private int y;

    public void paintComponent(Graphics graphics){
        graphics.setColor(Color.cyan);
        graphics.fillOval(x,y, 10, 50);
    }

    class Animated{
        public void paintComponent(Graphics graphics){
            graphics.setColor(Color.ORANGE);
            graphics.fillOval(x,y, 10, 50);

        }

    }
}
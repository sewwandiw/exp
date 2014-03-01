package test5;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/24/13
 * 1:13 PM
 */

public class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics graphics){
        // graphics.setColor(Color.cyan);
        //  graphics.fillRect(20,50,10,50);
//        Image image = new ImageIcon("E:\\JAVA\\test3\\src\\test5\\sew.jpg").getImage();
//        BufferedImage image = null;
//        try {
//            image = ImageIO.read(new File("E:\\JAVA\\test3\\src\\test5\\sew.jpg"));
//        } catch (IOException e) {
//            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
//        }

//        graphics.drawImage(image,30,40,this);


//        graphics.fillRect(0,0,this.getWidth(),this.getHeight());
//
        Graphics2D graphics2D = (Graphics2D) graphics;

        int red =(int) (Math.random()*255);
        int green =(int) (Math.random()*255);
        int blue =(int) (Math.random()*255);
        Color startColor = new Color(red,green,blue);
        graphics.setColor(startColor);

        red =(int) (Math.random()*255);
        green =(int) (Math.random()*255);
        blue =(int) (Math.random()*255);
        Color endColor = new Color(red,green,blue);
        graphics.setColor(endColor);


//        graphics.fillOval(50,50,70,70);
//        Graphics2D graphics2D = (Graphics2D) graphics;
        GradientPaint gradientPaint = new GradientPaint(70,50,startColor,150,150,endColor);
        graphics2D.setPaint(gradientPaint);
        graphics2D.fillOval(70, 70, 100, 100);


    }


}

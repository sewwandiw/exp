package test6;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/27/13
 * 5:56 PM
 */
 import java.io.*;
public class Box implements Serializable  {
    private int width;
    private int height;

    public void setWidth(int w){
        width = w;

    }
    public void setHeight(int h){
        height = h;
    }

    public static void main(String[] args) {
        Box box =new Box();
        box.setHeight(20);
        box.setWidth(20);
        try {
            FileOutputStream fs = new FileOutputStream("foo.ser");
            ObjectOutputStream ob =new ObjectOutputStream(fs);
            ob.writeObject(box);
            ob.close();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }
}

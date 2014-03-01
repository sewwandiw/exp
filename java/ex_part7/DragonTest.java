package test6;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/27/13
 * 11:12 PM
 */
import java.io.*;
public class DragonTest {
    public static void main(String[] args) {
        GragonGame d =new GragonGame();
        System.out.println(d.getX()+d.getY()+d.getZ());
        try {
            FileOutputStream fo =new FileOutputStream("dg.sar");
            ObjectOutputStream oo =new ObjectOutputStream(fo);
            oo.writeObject(d);
            oo.close();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

        try {
            FileInputStream fis =new FileInputStream("dg.sar") ;
            ObjectInputStream ois =new ObjectInputStream(fis);
            d =(GragonGame) ois.readObject();
            ois.close();

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        System.out.println(d.getX()+d.getY()+d.getZ());
    }


}

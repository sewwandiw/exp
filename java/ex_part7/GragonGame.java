package test6;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/27/13
 * 11:08 PM
 */
import java.io.*;
public class GragonGame implements Serializable {
    public int x = 3 ;
    transient long y =4;
    private short z =5;

    int getX(){
        return x;
    }

    long getY(){
        return y;
    }

    short getZ(){
        return z;
    }


}

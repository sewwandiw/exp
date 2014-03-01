package test6;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/29/13
 * 3:58 PM
 */
import java.io.*;
public class Mountain  {

   public String name;
   public int height;

    public Mountain(String longs, int i) {
     name = longs;
     height = i;
    }
    public String getName(){
        return name;
    }

    public int getHeight(){
        return height;
    }

   public String toString(){
       return  name +" "+ height;
   }




}

package test6;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/27/13
 * 6:25 PM
 */
import java.io.*;
public class GameCharactor implements Serializable{
    int power;
    transient String type;
    String[] weapons;

    public GameCharactor(int p ,String t ,String[] w){
      power = p ;
      String type = t;
      weapons =w;
    }

    public int getPower(){
        return power;
    }

    public String getType(){
        return type;
    }

    public String getWeapons(){
        String weaponList = " ";

        for (int i = 0; i < weapons.length; i++) {
           weaponList  += weapons[i]+"";
        }
        return weaponList;
    }

}

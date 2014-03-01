package test6;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/27/13
 * 6:25 PM
 */
import java.io.*;

public class GameServerTest {
    public static void main(String[] args) {
        GameCharactor one = new GameCharactor(50,"ELF",new String[]{"bow","Sword","Dust"} );
        GameCharactor two = new GameCharactor(200,"Roll",new String[]{"bare hands","Dust Signal"});
        GameCharactor three = new GameCharactor(120,"magician",new String[]{"Spells","Invisibility"});

        try {
            FileOutputStream fo  =new FileOutputStream("game.sar");
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(one);
            oo.writeObject(two);
            oo.writeObject(three);
            oo.close();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }

        one = null;
        two =null;
        three = null;

        try {
            FileInputStream fi = new FileInputStream("game.sar");
            ObjectInputStream oi = new ObjectInputStream(fi);

            GameCharactor oneRestore =(GameCharactor) oi.readObject();
            GameCharactor twoRestore =(GameCharactor) oi.readObject();
            GameCharactor threeRestore =(GameCharactor) oi.readObject();

            System.out.println("one is" + oneRestore.getWeapons());
            System.out.println("two is" + twoRestore.getType());
            System.out.println("three is" + threeRestore.getWeapons());

        }
        catch (Exception ex){
            ex.printStackTrace();
        }

    }
}

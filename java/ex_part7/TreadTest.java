package test6;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/28/13
 * 9:32 PM
 */
import java.lang.*;
public class TreadTest {

    public static void main(String[] args) {
      ThreadOne t1 = new ThreadOne();
      ThreadTwo t2 =new ThreadTwo();

      Thread one = new Thread(t1);
      Thread two = new Thread(t2);
      one.start();
      two.start();
    }
}

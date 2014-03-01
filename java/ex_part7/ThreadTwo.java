package test6;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/28/13
 * 10:43 PM
 */
import java.lang.*;
public class ThreadTwo implements Runnable{


    Accum a = Accum.getAccum();
    @Override
    public void run() {
        for (int i = 0; i < 99; i++) {
            a.upDateCounter(1);
        }
        try {
            Thread.sleep(50);
        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }

        System.out.println("two"+ a.getCounter());
    }
}

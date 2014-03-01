package test6;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/28/13
 * 2:57 PM
 */
 import java.lang.*;
public class MyRunnable implements Runnable  {
    @Override
    public void run() {
        go();
    }

    private void go() {
        try {
            Thread.sleep(2000);

        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }
        doMore();
    }

    private void doMore() {
        System.out.println("Top of the stack");

    }
}

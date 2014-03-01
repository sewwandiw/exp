package test6;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/28/13
 * 4:32 PM
 */
 import java.lang.*;

public class TestSync implements Runnable {
   private int balance;
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
             increment();
            System.out.println("Balance is"+" "+balance+" "+ Thread.currentThread().getName());

        }
    }

    private synchronized void increment() {
        int i = balance;
        balance = balance +1 ;
    }
}

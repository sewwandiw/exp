package test6;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/28/13
 * 2:56 PM
 */

public class ThreadTest {
    public static void main(String[] args) {
        MyRunnable runnable =new MyRunnable();
        Thread t =new Thread(runnable);
        t.start();
        System.out.println("in the main");

        }
    }



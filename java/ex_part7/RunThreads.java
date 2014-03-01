package test6;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/28/13
 * 3:04 PM
 */

public class RunThreads implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 25; i++) {
            String threadName =Thread.currentThread().getName();
            System.out.println(threadName + " is running");
        }
    }

    public static void main(String[] args) {

        RunThreads runner = new RunThreads();
        Thread alpha =new Thread(runner);
        Thread beta =new Thread(runner);
        alpha.setName("Alpha thread");
        beta.setName("beta thread");
        alpha.start();

        try {
            Thread.sleep(1000);

        }
        catch (InterruptedException ex){
            ex.printStackTrace();
        }
        beta.start();


    }
}

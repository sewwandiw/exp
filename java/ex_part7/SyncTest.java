package test6;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/28/13
 * 4:33 PM
 */
import java.lang.*;
public class SyncTest {
    public static void main(String[] args) {
        TestSync stest = new TestSync();
        Thread ane = new Thread(stest);
        Thread two = new Thread(stest);
        ane.start();
        two.start();
        ane.setName("sew");
        two.setName("rajika");


    }

}


package test5;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/24/13
 * 6:47 PM
 */

public class OuterClass2 {
    private int x;
    InnerClass inner = new InnerClass();

    public class InnerClass {
        public void go() {
            x = 45;
            System.out.println(x);
        }
        void doStuff() {
            inner.go() ;
        }
    }
}





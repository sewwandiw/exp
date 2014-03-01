package test5;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/24/13
 * 6:50 PM
 */

public class OutClassTest {
    public static void main(String[] args) {
        OuterClass2 outerClass = new OuterClass2();
        OuterClass2.InnerClass innerobj = outerClass.new InnerClass();
        innerobj.doStuff();

    }
}

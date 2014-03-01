package test3;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/22/13
 * 4:27 PM
 */

public class StaticTest extends StaticSuper {
    static int rad;
    static {
        rad =(int)(Math.random()*6);
        System.out.println("Static block "+ rad);
    }
    StaticTest(){
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("in test3.Main");
        StaticTest t =new StaticTest();
    }
}

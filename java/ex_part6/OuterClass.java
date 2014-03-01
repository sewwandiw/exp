package test5;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/24/13
 * 6:33 PM
 */

public class OuterClass {
   private static  int x;

    static class InnerClass{
      void go(int y){
          x = y+10;
          System.out.println(x);
      }
    }

    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        innerClass.go(45);

    }
}

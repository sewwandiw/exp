package test4;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/23/13
 * 11:55 PM
 */

public class ExTestDrive {
    static void doRisky(String t) throws MyEx{
        System.out.print("h");
        if ("yes".equals(t)){
            System.out.print("a");
        }
        else {
            System.out.print("r");
            System.out.print("o");
        }
    }

    public static void main(String[] args) {
      String test =args[0];
        System.out.print("t");
        try {
            doRisky(test);

        }
        catch (MyEx ex){
             ex.printStackTrace();
        }
        finally {
            System.out.print("w");
            System.out.print("s");
        }
    }

}

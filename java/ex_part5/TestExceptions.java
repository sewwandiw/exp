package test4;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/23/13
 * 1:58 PM
 */

public class TestExceptions {
    public static void main(String[] args) {
        String test ="yes";
        try {
            System.out.println("Start try");
            doRiscky(test);
            System.out.println("end try");
        }
        catch (ScaryException ex){
            System.out.println("ScaryException");
        }
        finally {
            System.out.println("Finally");
        }
        System.out.println("end of main");
    }

    static void doRiscky(String s) throws ScaryException {
        System.out.println("Risk starts");
        if ("yes".equals(s)) {
          throw new ScaryException();

        }
        System.out.println("end of risk");
        return;
    }
}

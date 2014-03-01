package test6;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/28/13
 * 10:41 PM
 */

public class Accum {
    private static Accum a = new Accum();
    private int counter = 0;


    private Accum(){}

    public static Accum getAccum() {
        return a;
    }
    public void upDateCounter(int add){
        counter += add;
    }


    public int getCounter(){
        return counter;
    }



}

package test3;

/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/20/13
 * Time: 8:30 PM
 */

public class SonOfBoo extends Boo {
    public SonOfBoo(){
        super("boo");
    }
    public SonOfBoo(int x){
        super(42);
    }
    public SonOfBoo(String s){
        super("fred");
    }
    public SonOfBoo(String s,int x){
        super("fred",42);
    }

}

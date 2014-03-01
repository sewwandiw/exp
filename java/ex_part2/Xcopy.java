/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/16/13
 * Time: 2:06 PM
 */

public class Xcopy {
    public static void main(String[] args) {

        int origin=42;

        Xcopy x = new Xcopy();
        int y = x.go(origin);
        System.out.println("origin is "+ y);

    }

    int go(int arg){
        arg =arg *2;
        return arg;
    }

}

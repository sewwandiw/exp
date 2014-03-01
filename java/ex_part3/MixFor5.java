/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/16/13
 * Time: 11:57 PM
 */

public class MixFor5 {
    public static void main(String[] args) {
        int x = 0 ;
        int y = 30;

        for (int outet = 0; outet < 3 ; outet++){
            for (int inner = 4; inner > 1 ; inner--){
                x--;

                y =y - 2;
                if (x==6){
                    break;
                }
                x = x + 3;
            }
            y =y -2 ;
        }
        System.out.println(x+" "+ y);
    }
}

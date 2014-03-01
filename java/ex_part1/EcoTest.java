/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/15/13
 * Time: 8:55 PM
 */

public class EcoTest {
    public static void main(String[] args) {
        Echo e1 =new Echo();
        Echo e2 =new Echo();
        int x = 0 ;

        while (x < 4){
            e1.hell0();
            e1.count = e1.count + 2;
            if (x == 3){
                e2.count =e2.count + 6;
            }
            if (x > 0){
                e2.count =e2.count + e1.count ;
            }
            x = x + 1 ;
        }
        System.out.println(e2.count);

    }
}

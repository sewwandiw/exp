/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/18/13
 * Time: 11:36 PM
 */

public class MonstorDriveTest {
    public static void main(String[] args) {
        Mostor[] ma =new Mostor[3];
        ma[0]  = new Vampair();
        ma[1]  = new Dragon();
        ma[2]  = new Mostor();

        for (int x=0;x<3 ;x++){
           ma[x].frighen(x);
        }

    }
}

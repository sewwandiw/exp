/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/15/13
 * Time: 8:01 PM
 */

public class player {
    int number = 0;
    public void guess(){
        number =(int) (Math.random()*10);
        System.out.println("My guessing number is" + number);

    }
}

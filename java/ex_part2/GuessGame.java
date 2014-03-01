/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/15/13
 * Time: 8:01 PM
 */

public class GuessGame {

    player p1;
    player p2;
    player p3;

    public  void startgame(){

        p1 = new player();
        p2 = new player();
        p3 = new player();

        int guessp1 =0 ;   // initial guess
        int guessp2 =0 ;
        int guessp3 =0 ;

        boolean p1isright = false;
        boolean p2isright = false;
        boolean p3isright = false;

        int targetnumber = (int) (Math.random()*10);
        System.out.println("The target guess is" + targetnumber);

        while (true)  {
            System.out.println("Number to guess is" + targetnumber);
            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            guessp2 = p2.number;
            guessp3 = p3.number;

            System.out.println("Guess of player 1 is" + guessp1);
            System.out.println("Guess of player 2 is" + guessp2);
            System.out.println("Guess of player 3 is" + guessp3);

            if (targetnumber==guessp1){
                p1isright =true;
            }
            if (targetnumber==guessp2){
                p2isright =true;
            }
            if (targetnumber==guessp3){
                p3isright =true;
            }

            if (p1isright|| p2isright || p3isright){
                System.out.println("We have a winner");
                System.out.println("Player 1 is " + p1isright);
                System.out.println("Player 2 is " + p2isright);
                System.out.println("Player 3 is " + p3isright);
                break;
            } else{
                System.out.println("We do not have a winner !!");
            }
        }

    }
}




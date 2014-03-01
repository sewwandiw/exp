package test3; /**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/22/13
 * Time: 1:33 PM
 */

public class PlayerTest {
    public static void main(String[] args) {
        System.out.println("no of player"+ Player.playerCount);
        Player[] n = new Player[3];
        n[0] = new Player("SEW");
        n[1] = new Player("Rajika");
        n[2] = new Player("Tiger");

       // for (int x = 0 ; x< 3 ; x++){

       // System.out.println("no of player"+n[x].playerCount);
       // }
    }
}

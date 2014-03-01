package test3;

/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/22/13
 * Time: 1:33 PM
 */

public class Player {
    private String name;
    static int playerCount;

    public Player(String n){
        name = n ;
        System.out.println("Name of player"+name);
        playerCount++;
        System.out.println("no of player"+playerCount);

    }
}

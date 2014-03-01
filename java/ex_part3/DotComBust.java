/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/17/13
 * Time: 4:38 PM
 */
import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList = new ArrayList<DotCom>();
    private int noOfGuess = 0;

    private void setUpGame(){
        DotCom one = new DotCom();
        DotCom two = new DotCom();
        DotCom three =new DotCom();

        one.setName("peta.com");
        two.setName ("etoys.com");
        three.setName("Go2.com");

        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        System.out.println("your goal is to sick three dotcoms");
        System.out.println("pets.com,etoys.com,Go2.com");
        System.out.println("Try to sink them with fever no of guesses");

        for (DotCom dotComToSet : dotComList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);

        }

    }
    private void startGame(){
        while (!dotComList.isEmpty()){
            String guessUser = helper.getUserInput("Enter a guess");
            checkUserGuess(guessUser);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess){
        noOfGuess++;
        String result ="miss";
        for (DotCom dotComToTest :dotComList){
            result =dotComToTest.checkYourSelf(userGuess);
            if (result.equals("hit")){
                break;
            }
            if (result.equals("kill")){
                dotComList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    private void finishGame(){
        System.out.println("All dotcoms dead");
        if (noOfGuess<= 18){
            System.out.println("you took"+ noOfGuess +" "+"guesses");
            System.out.println("You saved");
        }
        else {
            System.out.println("you took long"+ noOfGuess +" "+"guesses");
            System.out.println("Not good");
        }
    }

    public static void main(String[] args) {
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startGame();
    }

}

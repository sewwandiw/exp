import java.util.ArrayList;

/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/16/13
 * Time: 8:18 PM
 */

public class SimpleDotComTest {
    public static void main(String[] args) {
        int noOfGuess = 0;
        SimpleDotCom dot =new SimpleDotCom();
        Helper help = new Helper();
        int place =   (int) (Math.random()* 5);
        //int [] Location = {place,place+1,place+2};

        ArrayList<String> Location = new ArrayList<String>() ;
        Location.add(""+ place);
        Location.add(""+ place + 1);
        Location.add(""+ place + 2);
        dot.setLocationCell(Location);

        boolean isalive = true;
        while (isalive==true)
        {
            String userguess = help.getUserInput("Enter the location");
            String result =  dot.check(userguess);
            noOfGuess++;
            if (result.equals("kill")) {
                isalive = false;
                System.out.println("you took"+ noOfGuess +"guess");
            }
        }
    }
}


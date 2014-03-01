/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/17/13
 * Time: 4:38 PM
 */
import java.util.*;
public class DotCom {

    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc){
        locationCells =loc;
    }
    public void setName(String n){
        name = n;
    }
    public String checkYourSelf(String userInput){
        String result ="miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0){
            locationCells.remove(index);
            if (locationCells.isEmpty()){
                result ="kill";
                System.out.println("you sank"+name );
            }
            else {
                result ="hit";
            }
        }
        return result;
    }

}

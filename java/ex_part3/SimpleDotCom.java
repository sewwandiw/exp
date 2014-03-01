/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/16/13
 * Time: 8:18 PM
 */
import java.util.ArrayList;
public class SimpleDotCom {
    // int[] locationCell;
    private ArrayList<String> locationCell;
    int noOfHits = 0;


    //public void setLocationCell(int[] locationCell){
    public void setLocationCell(ArrayList<String> Location){
        locationCell = Location;
    }
    public String check(String guessVariable){
        int guess = Integer.parseInt(guessVariable);
        String result = "Miss";
        //for (int cell : locationCell){
        //  if (guess == cell){
        //    result = "hit";
        //   noOfHits++ ;
        // break;
        //}
        int index =locationCell.indexOf(guessVariable);
        if (index >= 0) {
            locationCell.remove(index);
            // result = "hit";
            //noOfHits++;
            //if (noOfHits == locationCell.length) {
            //  result ="kill";
            //}
            if (locationCell.isEmpty()) {
                result ="kill";
            } else  {
                result = "hit";
            }
        }
        System.out.println(result);
        return result;
    }
}


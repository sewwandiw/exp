/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/16/13
 * Time: 9:05 PM
 */
 import java.io.*;
 public class Helper {
    public String getUserInput(String input){
        String location = null;
        System.out.print(input + " ");
        try {
            BufferedReader is =new BufferedReader(new InputStreamReader(System.in));
            location = is.readLine()  ;
            if (location.length()==0)
                return null;
        }
        catch (IOException e){
            System.out.println("IOException"+ e);
        }
        return location;
    }
}

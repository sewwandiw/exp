/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/17/13
 * Time: 4:38 PM
 */
import java.io.*;
import java.util.*;
public class GameHelper {
    private static final String alphabet ="abcdefg";
    private int gridLength =7;
    private int gridSize =49;
    private int [] grid =new int[gridSize];
    private int comCount = 0;

    public String getUserInput(String prompt){
        String inputLine =null;
        System.out.println(prompt);
        try {
            BufferedReader is = new BufferedReader( new InputStreamReader(System.in));
            inputLine =is.readLine();
            if (inputLine.length()==0){
                return null;

            }
        }
        catch (IOException e){
            System.out.println("IOexception" + e);
        }
        return inputLine.toLowerCase();
    }


    public ArrayList<String> placeDotCom(int comSizs){
        ArrayList<String> alphaCells =new ArrayList<String>();
        String[] alphaCoords =new String[comSizs];
        String temp = null;
        int[] coords = new int[comSizs];
        int attemps = 0;
        boolean sucess =false;
        int location = 0;

        comCount++;
        int incr = 1;
        if ((comCount % 2)==1){
            incr =gridLength;
        }
        while (!sucess && attemps++ < 200){
            location =(int)(Math.random()*gridSize);

            int x = 0;
            sucess =true;
            while (sucess && x < comSizs){
                if (grid[location]==0) {
                    coords[x++]=location;
                    location += incr;
                    if (location>gridSize){
                        sucess =false;
                    }
                    if (x > 0 &&(location % gridLength)==0){
                        sucess=false;
                    }
                }
                else {
                    sucess =false;
                }
            }


        }

        int x = 0;
        int row = 0 ;
        int colomn = 0;
        while (x < comSizs){
            grid[coords[x]]=1;
            row =(int) (coords[x] /gridLength);
            colomn = coords[x] % gridLength;
            temp =String.valueOf(alphabet.charAt(colomn));
            alphaCells.add(temp.concat(Integer.toString(row)));
            x++;
        }
        return alphaCells;
    }
}

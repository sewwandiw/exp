/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/16/13
 * Time: 11:05 AM
 */

public class Dgod {
    String name;
    int size;
    String k;

    void bark(int noofbark){
        if (size> 60)  {
           k = "WOO WOO" ;
        }
        else if (size >14){
            k ="ROO ROO";
        }
        else{
            k="BOW WOW";
        }

        while (noofbark>0){
            System.out.print(k);
            noofbark = noofbark - 1 ;
        }


    }
}

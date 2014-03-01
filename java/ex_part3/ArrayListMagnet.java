/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/18/13
 * Time: 5:13 PM
 */
import java.util.*;
public class ArrayListMagnet {

    public static void printAL(ArrayList<String> al){
        for (String element:al){
            System.out.print(element+" ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        ArrayList<String> a =new ArrayList<String>();
        a.add(0,"zero");
        a.add(1,"One");
        a.add(2,"two");
        a.add(3,"three");
        printAL(a);

        if (a.contains("three")) {
            a.add("four");
        }
        a.remove(2);
        printAL(a);

        if (a.indexOf("four")!= 4){
            a.add(""+ 4);

        }
        printAL(a);

        a.add(5,"2.2");
        printAL(a);
    }




}

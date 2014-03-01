/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/16/13
 * Time: 12:05 AM
 */

public class ArrayTest {


    public static void main(String[] args) {
        String[] island = new String[4];

        island[0] ="Bermuda";
        island[1] ="Fugi";
        island[2] ="Arizona";
        island[3] ="Cosmuel";

        int[] index = new int[4];
        index[0] =1;
        index[1] =3;
        index[2] =0;
        index[3] =2;

        for (int y = 0 ; y< island.length; y ++) {
            int ref =index[y];
            System.out.println(island[ref]);

        }

    }
}

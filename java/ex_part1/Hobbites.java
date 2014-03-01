/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/15/13
 * Time: 11:52 PM
 */

public class Hobbites {
    String name;

    public static void main(String[] args) {
        Hobbites[] h = new Hobbites[3];


        int z = -1;
        while (z < 2){
            z = z + 1;
            h[z]  = new Hobbites();
            h[z].name ="Sew";
            if (z==1){
                h[z].name="raj";
            }
            if (z==2){
                h[z].name="kk";
            }

            System.out.println(h[z].name);
        }

    }
}

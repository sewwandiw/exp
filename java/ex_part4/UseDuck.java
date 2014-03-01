package test3;

/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/20/13
 * Time: 2:35 PM
 */

public class UseDuck {
    public static void main(String[] args) {
        int weight = 8 ;
        float density =2.3F;
        String name ="Donald";
        long[] feathers ={1,2,3,4,5,6};
        boolean canFly =true;
        int airSpeed =22;

        Duck[] d =new Duck[7];
        d[0] = new Duck();
        d[1] = new Duck(density,weight);
        d[2] = new Duck(name,feathers);
        d[3] = new Duck(canFly);
        d[4] = new Duck(3.3F ,airSpeed);
        d[5] = new Duck(false);
        d[6] = new Duck(airSpeed,density);



        //d.setSize(42);
    }
}

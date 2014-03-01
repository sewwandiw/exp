package test3;

/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/20/13
 * Time: 2:35 PM
 */

public class Duck{
    int pound = 6;
    float flatability = 2.1f;
    String name = "Generic";
    long[] feathers = {1,2,3,4,5,6,7};
    boolean canFly = true;
    int maxSpeed = 25;

    public Duck(){
        System.out.println("type 1 duck");
    }
    public Duck(float d,int w ){
        flatability =d;
        pound =w;
        System.out.println("type 2 duck");
    }

    public Duck(String n,long[] f){
        name = n;
        feathers = f;
        System.out.println("type 3 duck");
    }
    public Duck(boolean c){
        canFly =c;
        System.out.println("type 4 duck");
    }

    public Duck(int a,float x ){
        flatability =x;
        maxSpeed =a;
        System.out.println("type 5 duck");
    }




}

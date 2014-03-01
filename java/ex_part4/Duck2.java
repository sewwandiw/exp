package test3;

/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/20/13
 * Time: 8:06 PM
 */

public class Duck2 extends Animal {
    int size;

    public Duck2(int x,String name){
        super(name);
        size =x;
        System.out.println(size+name);
    }

}

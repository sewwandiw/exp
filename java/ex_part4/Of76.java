package test3;

/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/19/13
 * Time: 7:02 PM
 */

public  class Of76 extends Clowns  {
    public static void main(String[] args) {
        Nose[] i = new Nose[3];
        i[0] = new Acts();
        i[1] = new Clowns();
        i[2] = new Of76();
        for (int x=0 ; x < 3 ; x++){
            System.out.println(i[x].iMethod()+" "+i[x].getClass());
        }

    }


}

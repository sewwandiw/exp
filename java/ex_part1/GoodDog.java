/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/16/13
 * Time: 1:25 PM
 */

public class GoodDog {
    private int size;

    public int getSize(){
        return size;
    }

    public void setSize(int s){
        size = s;
    }
    void bark(){
       if (size > 60){
           System.out.println("BOW WOU");
       }
        else if (size >14){
           System.out.println("RII RII");
       }
        else {
           System.out.println("maw maw");
       }
    }

}

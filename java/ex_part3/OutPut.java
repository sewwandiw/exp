/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/16/13
 * Time: 11:40 PM
 */

public class OutPut {
    public static void main(String[] args) {
        OutPut o =new OutPut();
        o.go();

    }

    public void go(){
        int y = 7 ;
        for (int x = 0 ;x <8 ;x++){
            y++;
            if (x > 4){
                System.out.print(++y +" ");
            }
            if (y >14){
                System.out.println("x=" + x);
                break;
            }
        }
    }
}

/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/16/13
 * Time: 12:14 AM
 */

public class Traingle {

    int width;
    int height;
    double area;

    public static void main(String[] args) {
        Traingle[] ta = new Traingle[4];
        int x = 0  ;

        while (x < 4)  {

            ta[x] =new Traingle();
            ta[x].width = (x+1)*2;
            ta[x].height = x+4 ;
            ta[x].setArea();
            System.out.println(ta[x].area+" "+ x);
            x = x+1 ;
        }
    }
    void setArea(){
        area = width* height /2 ;


    }


}


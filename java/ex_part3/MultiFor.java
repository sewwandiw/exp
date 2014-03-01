/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/16/13
 * Time: 11:49 PM
 */

public class MultiFor {
    public static void main(String[] args) {

        for (int x = 0 ;x < 4 ; x++){

            for (int y = 4 ; y > 2 ;y--){
            System.out.println(x+" "+ y);
            }
            if (x== 1){
                x++;
            }
        }
    }
}

/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/16/13
 * Time: 2:30 PM
 */

public class puzzel4 {
    public static void main(String[] args) {
        puzzel4b[] obs =new puzzel4b[6];
        int x = 0 ;
        int y = 1;
        int result =0;

        while (x < 6){
          obs[x] = new puzzel4b();
          obs[x].ivar = y;
          y = y*10;
          x = x+1 ;

        }
        x = 6;
        while (x > 0){
            x = x -1 ;
            result = result +   obs[x].dostuff(x);
        }
        System.out.println("result"+result);
    }

}

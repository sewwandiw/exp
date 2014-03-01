package test3; /**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/20/13
 * Time: 10:15 PM
 */
import java.util.*;
public class SimTest {
    public static void main(String[] args) {
      ArrayList alist = new ArrayList();
      SimUnit s = new SimUnit();
        V2Radiator v2 =new V2Radiator(alist);
        V3Radiator v3 =new V3Radiator(alist);
        System.out.println(s.powerUse());

        for (int z = 0 ;z <20 ; z++)  {
            RetensionBoots RB = new RetensionBoots(alist);
        }


    }

}

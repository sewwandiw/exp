package test3;

/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/20/13
 * Time: 10:33 PM
 */

public class SimUnit {
    String bootType;

    SimUnit(){
        powerUse();
    }
    SimUnit(String Type){
        bootType = Type;
        System.out.println(Type);

    }

    int powerUse(){
        if ("V3 Radiator".equals(bootType)){
            return 2;
        }
        else {
            return 4;
        }
    }
}

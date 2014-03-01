package test6;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/29/13
 * 6:29 PM
 */
import java.util.*;

public class TestMap {
    public static void main(String[] args) {
        HashMap<String,Integer> score = new HashMap<String, Integer>();
        score.put("Sew",10);
        score.put("rajika",15);
        score.put("Raj",20);
        System.out.println(score);
        System.out.println(score.get("Sew"));
    }
}

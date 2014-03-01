/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/18/13
 * Time: 11:49 PM
 */

public class TestBoat {
    public static void main(String[] args) {
        Boat b1 = new Boat();
        SnailBoat b2 = new SnailBoat();
        RawBoat b3 = new RawBoat();
        b2.setLength(32);
        b1.move();
        b3.move();
        b2.move();

    }
}

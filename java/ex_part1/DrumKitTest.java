/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/15/13
 * Time: 8:42 PM
 */

public class DrumKitTest {
    public static void main(String[] args) {
        DrumKit d = new DrumKit() ;
        if (d.snare == true)  {
        d.playsnare();
        }
        d.snare = false;
        d.playTopHat();

    }
}

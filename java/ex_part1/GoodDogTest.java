/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/16/13
 * Time: 1:25 PM
 */

public class GoodDogTest {
    public static void main(String[] args) {
        GoodDog one = new GoodDog();
        GoodDog two =new GoodDog();

        one.setSize(78);
        two.setSize(8);

        System.out.println("Dog one" + one.getSize());
        System.out.println("Dog two" + two.getSize());

        one.bark();
        two.bark();

    }
}

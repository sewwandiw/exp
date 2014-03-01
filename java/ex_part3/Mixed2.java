/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/18/13
 * Time: 11:29 PM
 */

public class Mixed2 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A a2 =new C();

        b.m1();
        c.m2();
        a.m3();

        a.m1();
        b.m2();
        b.m3();

        c.m1();
        c.m2();
        c.m3();

        a2.m1();
        a2.m2();
        a2.m3();

    }
}

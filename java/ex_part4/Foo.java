package test3;

/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/22/13
 * Time: 1:57 PM
 */
import static java.lang.System.out;
import static java.lang.Math.*;
import java.util.*;
public class Foo {
   //double y =Math.random();
   //float x = Math.max(10.5f,5.2f);
    //Integer y;
   // int x = (int) (Math.random()*10);
   // String s ="2";
   // boolean x =Boolean.parseBoolean("420.25");
   // double y =10;
   // String x =Integer.toString(y);
  //  String x =""+y;
    int a =4327908;
    double b=67080.46886;
   // String x =String.format("The rank is %,d out of %,.2f",a,b);
  // Date today = new Date();
  // String x = String.format("%tA,%<tB,%<td,%<tr",today);
    Calendar c = Calendar.getInstance();

    public void go(){
      //  y = x;
      //  System.out.println(x);
       c.set(2004, 0, 12, 12, 13, 40);
       long day1 =c.getTimeInMillis();
        day1 +=  1000*60*60;
        c.setTimeInMillis(day1);
        c.set(c.DATE, 1);
       System.out.println("roll 35 days" + c.getTime());
       out.println("sqrt" +sqrt(4));
    }

    public static void main(String[] args) {
        Foo x =new Foo();
        x.go();
    }

}


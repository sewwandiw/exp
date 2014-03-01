/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/15/13
 * Time: 11:30 PM
 */

public class Dog {
    String name ;
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name ="Shane";

        Dog[] mydog = new Dog[3];
        mydog[0] =new Dog();
        mydog[1] =new Dog();
        mydog[2] = dog1;

        mydog [0].name ="Fred";
        mydog [1].name ="Michie";

        System.out.println("Last dog name is "+ mydog[2].name);


        int x;
        for (x = 0; x < mydog.length ; x++) {
            mydog[x].bark();
        }

    }
    public void bark(){
        System.out.println(name + "BAU WAU");
    }





}

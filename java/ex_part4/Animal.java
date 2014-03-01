package test3;

/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/20/13
 * Time: 8:01 PM
 */

public abstract class Animal {
    private String name;

    public String getname(){
        return name;

    }
    public Animal(String theName){
        name =theName;
        System.out.println("test3.Animal");
    }

    public void eat() {


    }
}

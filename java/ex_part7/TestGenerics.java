package test6;

/**
 * Sewwandi Wijayaratna(sewwandi.wijayaratna@gmail.com)
 * 5/29/13
 * 6:34 PM
 */


import java.util.ArrayList;
import java.util.List;

public class TestGenerics {

    public static void main(String[] args) {
        new TestGenerics().go();
    }

    private void go() {
//          Animal[] animals = new Animal[3];
//          animals[0] = new Dog();
//          animals[1] = new Cat();
//          animals[2] = new Dog();
//         Animal[] animals ={ new Dog(),new Cat(),new Dog()};
//
        ArrayList<Animal> animals = new ArrayList<Animal>();
        List<Dog> dog = new ArrayList<Dog>();
        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());
//
//        Dog [] dog ={new Dog(),new Dog(),new Dog()};
        dog.add(new Dog());
        dog.add(new Dog());
        dog.add(new Dog());
//
        takeAnimal(animals);
         takeAnimal((ArrayList<? extends Animal>) dog);
//
    }
//
//       public void takeAnimal(Animal[] animals){



    //
//       public void takeAnimal(Animal[] animals){
    public void takeAnimal(ArrayList<? extends Animal> animals) {
//   animals.add(new Animal());
//        animals[0] = new Cat();
        for (Animal a:animals){
            a.eat();
            a.bark();
        }
    }


}


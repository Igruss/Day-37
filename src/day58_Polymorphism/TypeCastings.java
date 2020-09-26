package day58_Polymorphism;

import day57_Polymorphism.PhoneTask.Iphone;
import day57_Polymorphism.PhoneTask.Phone;
import day57_Polymorphism.PhoneTask.Samsung;
import day58_Polymorphism.AnimalTask.Animal;
import day58_Polymorphism.AnimalTask.Cat;
import day58_Polymorphism.AnimalTask.Dog;

public class TypeCastings {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Rex",2,'M');
        Cat cat1 = new Cat("Rea",4,'F');

        Animal animal = dog1; // done implicitly,auto
        Animal animal2 = cat1;
        System.out.println(dog1);
        System.out.println(cat1);

        System.out.println("==========================================");

        int x = 100;
        byte y = (byte) x;// MUST be done manually

        Animal animal3 = new Dog("Dzeki",3,'M');

        Dog dog2 = (Dog) animal3;
        dog2.bark();

        Animal animal4 = new Cat("Mia",5,'F');
        Cat cat2 = (Cat) animal4 ;
        cat2.scratch();

        System.out.println("===============================================");

        Iphone phone1 = new Iphone("Iphone","11","5",1199);
        Phone phone2 = phone1; // upcasting , implicitly

        Phone phone3 = new Samsung("Galaxy","S20","6",1100);
        Samsung phone4 = (Samsung) phone3 ; // down casting , manually

        // Iphone phone5 = (Iphone) phone3 ; // it will not compile,there's no IS RELATION(ClassCastException)








    }

}

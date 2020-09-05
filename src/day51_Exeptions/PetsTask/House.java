package day51_Exeptions.PetsTask;

public class House {

    public static void main(String[] args) {

        Dog dog1 = new Dog("Winston","Scotty Terrier",'M',4, "Black");

        System.out.println(dog1);

        Cat cat1 = new Cat("Lucy","Persian",'F',2,"Black and white") ;

        System.out.println(cat1);

        Tiger tiger1 = new Tiger("Tyson","Bengal",'M',4,"orangeBlack");

        System.out.println(tiger1);

        tiger1.eat();
        tiger1.drink();



    }

}

package day39_CustomClass;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.setDogInfo("Siwan","Beagle","medium",
                2,"Mix");
        dog2.setDogInfo("Roofus","Argetinian DOGA","large",
                1,"white");
        dog3.setDogInfo("Dzeki","Pastirski gonic","medium",
                6,"brown");

        dog1.getInfo();
        dog2.getInfo();
        dog3.getInfo();

        dog1.eat("dog food");
        dog2.eat("bones");
        dog3.eat("cajnu");

        dog1.drink("water");
        dog2.drink("red bull");
        dog3.drink("DZIBRU");




    }
}

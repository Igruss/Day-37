package day39_CustomClass;

public class DogPark {

    public static void main(String[] args) {

        Dog [] dogPark = {new Dog(),new Dog(),new Dog(),new Dog(),new Dog()};

        dogPark[0].setDogInfo("Tucker","German Shepperd",
                "Medium",6,"Mix");
        dogPark[1].setDogInfo("Roko","German Shepperd",
                "Medium",3,"Brown");
        dogPark[2].setDogInfo("Champ","Boxer",
                "Medium",4,"White");
        dogPark[3].setDogInfo("Rex","Doberman",
                "Medium",2,"Black");
        dogPark[4].setDogInfo("Chupa","Chiwava",
                "Small",2,"Kaki");

        for(int i =0;i <= dogPark.length-1;i++){
            dogPark[i].getInfo();
        }
        System.out.println("==================================");

        for(Dog eachDog : dogPark){
            eachDog.getInfo();
        }
        System.out.println("===================================");
        System.out.println("=====================================================");

        for(Dog eachDog : dogPark ){
            eachDog.getInfo();
        }

        System.out.println("====================================================");
        String food = "treats";
        for( Dog eachDog  : dogPark ){
            eachDog.eat(food);
        }

        System.out.println("=====================================================");
        String drink = "milk";
        for( Dog eachDog  : dogPark ){
            eachDog.drink(drink);
        }

        System.out.println("====================================================");
        // play



    }
}

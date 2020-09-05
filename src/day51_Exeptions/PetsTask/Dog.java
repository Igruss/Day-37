package day51_Exeptions.PetsTask;
/*
create a sub class of Pet called Dog
                    override the instance methods:
                        eat(): dog eats Chicken
                        drink(): dog drinks water
                        sleep(): dog sleeps on the bed

 */
public class Dog extends Pet {


    public Dog(String name, String breed, char gender, int age, String color) {
        super(name, breed, gender, age, color);
    }
/*
    public String toString(){
      return super.toString();// just an example (not necessary)
    }
*/

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}

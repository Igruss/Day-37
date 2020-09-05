package day51_Exeptions.PetsTask;

public class Tiger extends Pet{

    public Tiger(String name, String breed, char gender, int age, String color){
        super(name, breed, gender, age, color);
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    protected void eat(){
        System.out.println(name + " eats antelope");
    }
    protected void drink(){
        System.out.println(name + " is drinking water");
    }



}

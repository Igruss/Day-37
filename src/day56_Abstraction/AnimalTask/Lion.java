package day56_Abstraction.AnimalTask;

public class Lion extends Animal implements Swimmable,Playable{
    @Override
    public void eat() {
        System.out.println("Lion is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Lion is sleeping");

    }

    @Override
    public void play() {
        System.out.println("Lion is playing");

    }

    @Override
    public void swim() {
        System.out.println("Lion is swimming");

    }
}

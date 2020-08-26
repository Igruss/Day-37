package day46_ConstructorCalls;

public class ConsturctorCalls2 {

    public ConsturctorCalls2(){

        System.out.println("A");

    }

    public ConsturctorCalls2(int a){
        this();// Calling default constructor
        System.out.println("B");
    }

    public ConsturctorCalls2 (String str){
        this(5);
        System.out.println("C");
    }

    public ConsturctorCalls2 (char a){
        this();
        System.out.println("D");
    }

    public ConsturctorCalls2 (double a){
        this (10); // this always have to be at the first step
        System.out.println("E");
    }


    public static void main(String[] args) {

        new ConsturctorCalls2('E');

    }




}

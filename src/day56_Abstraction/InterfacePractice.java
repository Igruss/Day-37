package day56_Abstraction;

public interface InterfacePractice {

    int a = 200;

    public static final int b = 300;

    public static void method1(){
        System.out.println(a);
        System.out.println(b);
    }


    static void main(String[] args) { }  // static method

    public default void method2(){ } // default method

    //  public void method3(){ }  instance method

    //   public InterfacePractice(){ }  // constructor


    public abstract void method4(); // abstract method
    void method5(); // abstract method

    // static{ } // static block


    //  { }  // instance block

    // instance variables


}


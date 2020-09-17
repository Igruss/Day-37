package day55_Abstraction;

class A{ // can create object from it
    int a = 10;
    static  int b = 20;

    public void method1(){}

    static {}

    public A(){}
}

abstract class B{ // can not create object from it, cannot be final
    int a =10;
    static int b = 20;

    public void method1(){}

    public static void method2(){}

    static {}

    public B(){}

    public abstract void method3();

}


public class AbsClass_VS_regClass {



}

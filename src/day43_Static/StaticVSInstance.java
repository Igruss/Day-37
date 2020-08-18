package day43_Static;

public class StaticVSInstance {

    static int staticVariable;
    int instanceVariable;


    public static void main(String[] args) {

        StaticVSInstance obj1 = new StaticVSInstance();
        obj1.instanceVariable = 100;
        obj1.staticVariable = 500;

        StaticVSInstance obj2 = new StaticVSInstance();
        obj2.instanceVariable = 200;
        obj2.staticVariable = 400;

        System.out.println(obj1.instanceVariable);
        System.out.println(obj2.instanceVariable);

        System.out.println("========================================");

        System.out.println(obj1.staticVariable);
        System.out.println(obj2.staticVariable);

        System.out.println(StaticVSInstance.staticVariable);// prefered (thru class name)





    }
}

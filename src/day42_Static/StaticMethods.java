package day42_Static;

public class StaticMethods {

    int a = 200;
    static int b = 400;

    public static void main(String[] args) {

        System.out.println(b);
       // System.out.println(a); Cannot work (only way is to call it )

        StaticMethods obj = new StaticMethods();
        System.out.println(obj.a);

    }

    public static void staticMethod (){

    }
    public void instanceMethod (){

    }
}

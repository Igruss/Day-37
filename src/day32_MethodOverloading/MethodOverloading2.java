package day32_MethodOverloading;
/*
   1. create a method that can find the addition of two numbers
                        addition2Numbers
    2. create a method that can find the addition of three numbers
                        addition3Numbers
    3. create a method that can find the addition of four numbers
                        addition4Numbers

 */
public class MethodOverloading2 {

    public static void main(String[] args) {

        addition(22,44,555,44);

    }
 /*   public static void addition2Numbers(double a, double b){
        System.out.println(a+b);
    }
    public static void addition3Numbers(double a,double b, double c){
        System.out.println(a+b+c);
    }
    public static void addition4Numbers(double a, double b, double c, double d){
        System.out.println(a+b+c+d);
    }
*/  // Not easy to read and not reusable

    public static void addition(double a,double b){
        System.out.println(a+b);
    }
    public static void addition(double a,double b,double c) {
        System.out.println(a + b + c);
    }
    public static void addition(double a,double b,double c,double d) {
        System.out.println(a + b + c + d);
    }


}

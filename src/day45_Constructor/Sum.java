package day45_Constructor;

public class Sum {

    public Sum (double a,double b){
        System.out.println(a+" + "+b+" = "+(a+b));
    }
    public Sum (int a, int b){
        System.out.println(a+" + "+b+" = "+(a+b));
    }
    public Sum (int a,int b,int c){
        System.out.println(a+" + "+b+" + "+c+" = "+(a+b+c));
    }
    public Sum (double a,double b, double c){
        System.out.println(a+" + "+b+" + "+c+" = "+(a+b+c));
    }

    public static void main(String[] args) {
        Sum obj1 = new Sum (10,20.3,39);
    }

}

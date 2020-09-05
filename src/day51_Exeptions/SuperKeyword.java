package day51_Exeptions;


class Test{
    int a;

    public void method(){
        System.out.println("Hello");
    }

    public void m(){
        this.method();
     //   super.method(); cannot call because doesn't have SUPER class
    }


}



public class SuperKeyword extends Test {

    public void  print1(){

        System.out.println(a);// SuperKeyword a

    }

    public void print2(){
        System.out.println(super.a); // Test a

    }

    public void method2(){
        super.method();
        System.out.println("Holla");
    }

    public void method3(){
        this.method2();
        super.method();
    }


    public static void main(String[] args) {

        Test obj1 = new Test();
        obj1.a = 200;

        SuperKeyword obj2 = new SuperKeyword();
        obj2.a = 300;

        obj2.print2();

        obj2.method2();

        System.out.println("=================================");

        obj2.method3();





    }



}

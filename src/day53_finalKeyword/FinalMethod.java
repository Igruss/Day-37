package day53_finalKeyword;

class A{

    public final void method1(){
        System.out.println("Enter username and password");
    }

    private final void method1(int a){

    }
     public final static void method2(int b){

    }

}

public class FinalMethod extends A {
 /*   @Override
    public void method1(){     cannot override final method(but can overload)
        System.out.println("Enter something else");
    }
  */
 public final static void main(String[] args) {
     System.out.println("Hello");
 }


}

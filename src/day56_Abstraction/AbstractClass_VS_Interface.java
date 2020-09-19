package day56_Abstraction;

public abstract class AbstractClass_VS_Interface {

   private int a;
   protected static int b;

   public void method1(){ }

   public static void method2() { }

   public abstract void method3( );



}

interface A{
    int a = 10;// public static final

    static  void method2 () { } // public

    abstract void method3 ();
             int method3_2() ; // public abstract

    default void method4 () { }  //public


    public static void main(String[] args) {

        double b = Math.PI;
        int a = Integer.MAX_VALUE;


    }



}


















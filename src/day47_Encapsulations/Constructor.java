package day47_Encapsulations;

public class Constructor {

    static {
        System.out.println("Static block");
    }

    public Constructor(int a){
        System.out.println("int arg");
    }

    public Constructor(double a){
        this(10);
        System.out.println("double arg");

    }

    public Constructor(String a){
        System.out.println("String arg");
    }

    public static void main(String[] args) {
      //  new Constructor(10);
        new Constructor(10.9);
    }

}

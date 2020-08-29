package day47_Encapsulations;

public class Test {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicVariable);
        AccessModifiers.publicMethod();

        System.out.println(AccessModifiers.defaultVariable);

        //System.out.println(AccessModifiers.privateVariable);
       // Cannot call private method outside its class


        Encapsulation obj1 = new Encapsulation();
        System.out.println(obj1.getSsn());

        obj1.setSsn(15585697);

        System.out.println(obj1.getSsn());

    }


}

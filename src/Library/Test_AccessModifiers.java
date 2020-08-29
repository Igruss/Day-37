package Library;

import day47_Encapsulations.AccessModifiers;
public class Test_AccessModifiers {

    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicVariable);
        AccessModifiers.publicMethod();

       // System.out.println(AccessModifiers.defaultVariable); Cannot call default method
        //outside its package


    }



}

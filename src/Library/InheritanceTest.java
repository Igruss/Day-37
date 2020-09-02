package Library;

import day50_Inheritance_Overriding.AccessModifiers;

public class InheritanceTest extends AccessModifiers {

    public static void main(String[] args) {

        System.out.println(publicData);
        System.out.println(InheritanceTest.protectData);// protected is visible within child class
       // System.out.println(defaultData); not visible outside class

    }

}

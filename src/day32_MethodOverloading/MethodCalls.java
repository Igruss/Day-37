package day32_MethodOverloading;
import Library.Util ;

import java.util.Arrays;

public class MethodCalls {

    public static void main(String[] args) {

        String firstName = "IGor";
        String lastName = "ruSTeMi";

        String fullName;
        fullName = Util.formatFullName(firstName,lastName);
        System.out.println(fullName);

        String uniques = Util.uniques(fullName);
        System.out.println(uniques.toLowerCase());

        String reversedName = Util.reverse(fullName);
        System.out.println(reversedName);
        System.out.println("===============================");

        int[] a ={200,300,400,500,50,2999,685,77};
        int n = 2500;

        a=Util.addElement(a,n);

        System.out.println(Arrays.toString(a));




    }
}

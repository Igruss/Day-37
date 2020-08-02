package day34_WrapperClasses;

import java.util.Arrays;

public class WrapperClass {

    public static void main(String[] args) {

        Integer num = 100;
        int a = 100;

        byte b1 = 50;
        int n1 = b1; // Cannot assign to Integer (only accepts own value)

        int [] arr = new int [3];

        System.out.println(Arrays.toString(arr));

        Double [] arr1 = new Double[3];
        System.out.println(Arrays.toString(arr1));

        Double r1 = 300.0;
        double r2 = r1;   // unboxing (converting Wrapper to primitive)

        long l1 = 400;       // both done implicitly
        Long l2 = l1;// autoboxing  (converting primitive to Wrapper)




    }
}

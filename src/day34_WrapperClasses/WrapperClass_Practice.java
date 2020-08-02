package day34_WrapperClasses;

import java.util.Arrays;

public class WrapperClass_Practice {

    public static void main(String[] args) {

        int []  arr ={1,2,3,4};
        Integer [] arr2 = {1,2,3,4};

        for ( int each : arr2){
            System.out.println(each);
        }

        Double [] arr4 = {1.0,2.0,3.4,4.5,5.6,6.9};

        for(Double each : arr4){
            System.out.println(each);
        }

        char [] arr5 = {65,71,69,75};
        System.out.println(Arrays.toString(arr5));

        char ch =79;
        Character ch2 =79;

        System.out.println(ch2);

        System.out.println("===================================");

        String [] nums1 = {"12","13.1","14.7","15.6"};
        double [] nums2 = new double[nums1.length];

        for(int i = 0;i <= nums1.length-1;i++){
            nums2[i] = Double.parseDouble(nums1[i]);
        }
        System.out.println(Arrays.toString(nums2));


    }
}

package day33_LocalDateTime;

import java.util.Arrays;

/*
     1. create a method that can calculate the addition of two integers
        2. create a method that can calculate the addition of two decimals
        3. create a method that can calculate the multiplication of two integers
        4. create a method that can calculate the multiplication of two decimals

 */
public class Calculator {

    public static void main(String[] args) {
        int a = 10;
        double b = 20;
        System.out.println(addition(a,b));

        int [] arr1 = {4,3,2,1};
        Arrays.sort(arr1);

        char [] arr2 = {'C','B','A'};
        Arrays.sort(arr2);

        long l1 = 100;
        long l2 = 200;

        System.out.println(multiplication(l1,l2));//since long has higher value than int returns double


    }
    public static int addition(int a , int b){
        return a+b;
    }
    public static double addition (double a,double b){
        return a+b;
    }
    public static int multiplication (int a, int b){
        return a * b;
    }
    public static double multiplication (double a, double b){
        return a * b ;
    }



}

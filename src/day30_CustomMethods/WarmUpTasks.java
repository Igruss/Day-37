package day30_CustomMethods;

import java.util.Arrays;

/*
wamrmup tasks:
    1. create a function that can print out the maximum number between two numbers
    2. create a function that can print out the array of integers in descending order
    3. create a function that can print out the combination of two integer arrays
    4.
        step1: create a function that can check if the given integer is positive, negative or zero
        step2: Use the above method to  write a program that can check every single elements of an array of Integers
        MUST use for each loop
 */
public class WarmUpTasks {

    public static void main(String[] args) {

        maxNum(12,33);
        int arr[] ={3,344,67,4433,221,1,23,4};

        printDesc(arr);
        int []a1 = {1,2,3,4,5};
        int []a2 ={6,7,8,9,10,11,12,13,14,15,16};

        combine2Arrays(a1,a2);

        PosNegZero(0);
        System.out.println("============================");
        int a3 [] ={100,-100,-200,-300,0,900,5000};
        for(int each : a3){
            PosNegZero(each);
        }
    }

    public static void maxNum (int a,int b){
        if(a == b){
            System.out.println("Equal");
            return; // exits the method
        }
        if(a>b){
            System.out.println(a+" is maximum");
        }else{
            System.out.println(b+" is maximum");
        }

    }

    public static void printDesc(int [] arr){
        Arrays.sort(arr);

        for(int i =arr.length-1; i >=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void combine2Arrays(int arr1[],int arr2 []){
        int [] arr3 = new int [arr1.length + arr2.length];
        int i =0;

        for(int each : arr1){
            arr3[i] = each;
            i++;
        }
        for(int each : arr2){
            arr3[i] = each;
            i++;
        }
        System.out.println(Arrays.toString(arr3));



    }

    public static void PosNegZero(int num){
        if(num>0){
            System.out.println(num+" is positive");
        }else if(num <0){
            System.out.println(num+" is negative");
        }else{
            System.out.println(num+" is zero");
        }
    }


}
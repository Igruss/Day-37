package day28_Recap;

import java.util.Arrays;

/*
   int arr2D[][] = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };
            task1:
                9 10 11 12 13
                4 5 6 7 8
                1 2 3
            task2:
                3 2 1
                8 7 6 5 4
                13 12 11 10 9
            task3:
                13 12 11 10 9
                8 7 6 5 4
                3 2 1

 */
public class MultiD_Practice2 {

    public static void main(String[] args) {

        int arr2D[][] = { {1,2,3} ,  {4,5,6,7,8} ,  {9,10,11,12,13} };

        for(int i =arr2D.length-1;i >=0;i--){
            int arr1D[] = arr2D[i];
           for(int j= 0;j <=arr1D.length-1 ;j++){
               System.out.print(arr1D[j]+" ");
           }
            System.out.println();
        }
        System.out.println("-------------------------------");

        for(int i =0;i <= arr2D.length-1;i++){
            int[] arr1D = arr2D[i];
            for(int j = arr1D.length-1;j >=0;j--){
                System.out.print(arr1D[j]+ " ");
            }
            System.out.println();

        }
        System.out.println("===================================");

        for(int i = arr2D.length-1;i >=0;i--){
            int[]arr1 = arr2D[i];
            for(int j = arr1.length-1;j >=0;j--){
                System.out.print(arr1[j]+" ");
            }
            System.out.println();
        }

    }
}

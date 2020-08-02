package day33_LocalDateTime;
/*
       1. create a return method that can return an int array in descending order
        2. create a return method that can return a double array in descending order
        3. create a return method that can return a String array in descending order
        4. create a return method that can return a char array in descending order

 */
import java.util.Arrays;

public class SortDescending {

    public static void main(String[] args) {

        int [] arr ={1,4,3,5,2};
        Arrays.sort(arr);
       // System.out.println(Arrays.toString(arr));

        int [] arr2 = new int [arr.length];
        int k =arr.length-1;

        for(int i =0; i <= arr2.length-1;i++){
            arr2[i]=arr[k];
            k --;
        }
        System.out.println("======================================");

        int [] scores = {100,85,75,95,55,65};
        scores = sortDesc(scores);
        System.out.println(Arrays.toString(scores));

        System.out.println("========================================");
        double [] n1 = {5.5,6.5,7.6,3.5,0,1.5,0,5};
        n1 = sortDesc(n1);
        System.out.println(Arrays.toString(n1));

    }

    public static int [] sortDesc (int []arr){
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));

        int [] arr2 = new int [arr.length];
        int k =arr.length-1;

        for(int i =0; i <= arr2.length-1;i++){
            arr2[i]=arr[k];
            k --;
        }
        return arr2;
    }
    public static double [] sortDesc (double[] arr){
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr))[
       double[] arr2 = new double [arr.length];
         int  k =arr.length-1;

        for(int i =0; i <= arr2.length-1;i++){
            arr2[i]=arr[k];
            k --;
        }
        return arr2;
    }
    public static char [] sortDesc (char[] arr){
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr))[
        char[] arr2 = new char [arr.length];
        int  k =arr.length-1;

        for(int i =0; i <= arr2.length-1;i++){
            arr2[i]=arr[k];
            k --;
        }
        return arr2;
    }
    public static String [] sortDesc (String[] arr){
        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr))[
        String[] arr2 = new String[arr.length];
        int  k =arr.length-1;

        for(int i =0; i <= arr2.length-1;i++){
            arr2[i]=arr[k];
            k --;
        }
        return arr2;
    }




}

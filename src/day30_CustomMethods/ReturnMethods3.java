package day30_CustomMethods;

import java.util.Arrays;

public class ReturnMethods3 {

    public static void main(String[] args) {
        int []arr ={100,200,50,40,60};
        int num =max(arr);
        System.out.println(num);
        System.out.println(num > 499);

    }

    public static int max(int []arr){
        Arrays.sort(arr);
        int max = arr[arr.length-1];
        return max;
    }


}

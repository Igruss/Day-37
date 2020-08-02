package Office_Hours.Practice_07_21_2020;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Desc3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int size = scan.nextInt();

        int [] arr = new int [size];

        for(int i = 0;i <= size-1;i++){
            System.out.println("Enter a number:");
            arr [i] = scan.nextInt();
        }


        int [] descArr = new int [arr.length];
        int k = arr.length -1;
        for( int each : arr){
            descArr [k] = each;
            k--;
        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(descArr));


    }
}

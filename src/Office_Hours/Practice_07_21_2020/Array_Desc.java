package Office_Hours.Practice_07_21_2020;

import java.util.Arrays;

public class Array_Desc {

    public static void main(String[] args) {

        int [] arr = {99,97,100,200,55,68,79};
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int [] descArr = new int [arr.length];
        int k = 0;
        for(int i =6 ; i >= 0;i--){
            descArr[k] = arr[i];
            k++;
        }
        System.out.println(Arrays.toString(descArr));



    }
}

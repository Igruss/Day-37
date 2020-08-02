package day28_Recap;

import java.util.Arrays;

public class ArraysQuiz {

    public static void main(String[] args) {

        char [] arr ={'D','C','B','A'};
        Arrays.sort(arr);

        for(char each : arr){
            System.out.print(each);
            if(each == 'D'){
                continue;
            }
        }
        System.out.println();
        System.out.println("======================");

        int wd = 0;
        String [] days ={"sun","mon","wed","sat"};

        for(int i=0 ;i <= days.length -1; i++){

            switch(days[i]){
                case "sat":
                case "sun":
                    wd -= 1; // res is -1 but exit the switch
                    break;
                case "mon":
                    wd ++;// now is new switch wd == 1 + 2 + 2 - 1 =3;
                case "wed":
                    wd +=2;
            }

        }
        System.out.println(wd);
        System.out.println("==============================");

        int [] nums = {15,30,45,60,75};

        nums[2] = nums[4];
        nums[4] = 90;
        System.out.println(Arrays.toString(nums));

        System.out.println("============================");

        int arr1 [] = {1,2,3,4};
        int y = 0;

        do{
            System.out.println(arr1[y]);
            y++;

        }while(y < arr1.length -1);







    }
}

package day21_Loops;

import java.util.Scanner;

// write a program that asks user to enter 5 numbers and returns the minimum number
public class MinNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int min = 999999999;

        for(int i =1;i <= 5 ; i ++){
            System.out.println("Enter a number");
            int num = scan.nextInt();
            if(num<min){
                min = num ;
            }
        }

        System.out.println("Min number is: "+min);


    }


}

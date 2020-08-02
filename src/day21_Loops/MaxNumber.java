package day21_Loops;

import java.util.Scanner;

/*
write a program that asks user to enter 5 numbers and retuns the maximum number

 */
public class MaxNumber {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int max = - 2147483648 ;
        for(int i = 10 ; i <=50 ; i +=10){
            System.out.println("Enter a number");
            int num = scan.nextInt();
            if(num>max){ // if cond means that user enter num is entered will be max
                max=num;
            }
        }

        System.out.println("Max number: "+max);




    }

}

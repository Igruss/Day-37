package day24_Arrays;

import java.util.Scanner;

/*
write a program that asks user how many numbers he wants to enter, and get all the user inputs and store them into an array variable, and then write the program that can return maximum and minimum numbers

 */
public class MaxMin {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to enter?");
        int n = scan.nextInt();

        int [] arr = new int [n];

        for(int i =0;i < n;i ++){ // get user input and storing them in the array
            System.out.println("Enter a number");
            arr [i] = scan.nextInt();
        }
        int max = arr[0];
        int min = arr[0];

        for(int i =0; i <arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Maximum number is: "+ max);
        System.out.println("Minimum number is: "+ min);





    }
}

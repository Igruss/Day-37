package Office_Hours.Practice_07_08_2020;

import java.util.Scanner;

public class MaxNumber {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = -99999999;

        for(int i =1 ; i <= 5 ; i++){
            System.out.println("Enter a number");
            int n = scan.nextInt();

            if (n > max) {
                max = n;
            }

        }
        System.out.println("Max number is: "+max);




    }
}

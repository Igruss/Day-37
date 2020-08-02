package day27_recap;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Practice1 {

    public static void main(String[] args) {

        String [] classMates = {"Aalia","Nurbiye","Ayse"};

        System.out.println(classMates[1]);
        System.out.println("============================");

        for(int i =0; i <= classMates.length-1; i++){
          //  if (classMates[i].charAt(0) != 'A')
            if ( !classMates[i].startsWith("A")) {
                continue;
            }
            System.out.println(classMates[i]);
        }
        System.out.println("==============================");

        int [] numbers = new int [5];
        numbers[3]= 25;
        numbers[0]= 100;
        numbers[3] = 300;

        System.out.println(Arrays.toString(numbers));

        System.out.println("===============================");
        Scanner scan = new Scanner(System.in);
        System.out.println("How many names do you want to enter");
        String [] students = new String[scan.nextInt()];

        scan.nextLine();

        for(int i =0; i <=students.length -1 ; i++){
            System.out.println("Enter a name");
            students [i] = scan.nextLine();
        }
        System.out.println(Arrays.toString(students));




    }
}

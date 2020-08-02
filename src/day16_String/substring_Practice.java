package day16_String;

import java.util.Scanner;

/*
 write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than 3 characters, print the string itself

 */
public class substring_Practice {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter first word");
        String str1 = scan.next();
        System.out.println("Enter your second word");
        String str2 = scan.next();

       // String result= str1.substring(1).concat(str2.substring(1));
        String result=str1.substring(1) +str2.substring(1);
        System.out.println(result);
        System.out.println("=======================");

        String str = "I like to drink Pepsi";
        String drink = str.substring(16);
        String action = str.substring(10,15);

        System.out.println(drink);
        System.out.println(action);




    }



}

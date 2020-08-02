package day29_CustomMethods;

import java.util.Scanner;

public class MethodsWithParameter {
// 3. create a method that can calculate the age of the person
    public static void main(String[] args) {
        printHello(1);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter birth year and current year");
        age(scan.nextInt(),scan.nextInt());

    }

    public static void printHello(int n){
        for(int i =0;i<n;i++){
            System.out.println("Hello World");
        }
    }

    public static void age(int birthYear,int currentYear){
        if(currentYear < birthYear){
            System.out.println("Invalid Entry");
        }else{
            int age = currentYear - birthYear;
            System.out.println("You are "+age+" years old");
        }

    }




}

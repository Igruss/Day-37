package day023_Arrays;

import java.util.Scanner;

/*
 write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
            the program asks the user which bedroom does he/she wants to reserve and calculats the total price
            and then the program will ask:
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            while answer is neither yes or no ==> please re-enter
            HINT: nested loop task, outter loop need to be an infinite loop

 */
public class CybertekInn {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int total = 0;
        System.out.println("Welcone to Cybertek Inn");

        while(true) {
            System.out.println("Please choose from the following");
            System.out.println("1. King bed: $120");
            System.out.println("2. Queen bed: $100");
            System.out.println("3. Single bed: $80");
            int option = scan.nextInt();

            switch (option) {
                case 1:
                    total += 120;
                    break;
                case 2:
                    total += 100;
                    break;
                case 3:
                    total += 80;
                    break;

                default:
                    System.out.println("Get out !");
                    System.exit(0);

            }
            System.out.println("Do you want to reserve another room");
            String a = scan.next().toLowerCase();
            while (!(a.equals("yes") || a.equals("no"))){
                System.out.println("Invalid, Please re-enter!");
                System.out.println("Do you want to reserve another room");
                a = scan.next().toLowerCase();
            }


            if(a.equals("no")){
                break;
            }
        }
        System.out.println("Your total price is: $"+total);


    }
}

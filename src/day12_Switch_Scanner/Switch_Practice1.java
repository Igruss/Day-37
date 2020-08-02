package day12_Switch_Scanner;
/*
Write a program to display days:
1-Monday
2-Tuesday
3-Wednesday
4-Thursday
5-Friday
6-Saturday
 */

public class Switch_Practice1 {
    public static void main(String[] args) {
        int day = 1;

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");

            case 3:
                System.out.println("Wednesday");

            case 4:
                System.out.println("Thursday");

            case 5:
                System.out.println("Friday");

            case 6:
                System.out.println("Saturday");

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Invalid");



        }


    }

}

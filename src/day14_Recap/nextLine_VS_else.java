package day14_Recap;
import java.sql.SQLOutput;
import java.util.Scanner;
public class nextLine_VS_else {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");

        int age = input.nextInt();
        input.nextLine();

        System.out.println("Enter your full name");

        String fullName =input.nextLine();
        System.out.println(fullName);

        System.out.println("enter City");

        String City = input.nextLine();
        System.out.println(City);

        System.out.println(fullName+" "+ City + " " + age);






    }



}

package day15_String;
import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.Scanner;
public class Practice1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = input.next();
         char ch1  =firstName.charAt(0);

        System.out.println("Enter your last name: ");
        String lastName = input.next();
        char ch2 = lastName.charAt(0);

        System.out.print("Your initial is: "+ch1+"."+ch2);












    }
}

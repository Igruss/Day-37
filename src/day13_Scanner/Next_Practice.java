package day13_Scanner;
import java.util.Scanner;
public class Next_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firstName = scan.next();

        System.out.println(firstName);

        System.out.println("Enter your Last Name:");
        String lastName = scan.next();

        System.out.println(lastName);

        String fullName = firstName +" "+lastName;

        System.out.println("Full name is : "+fullName);




    }




}

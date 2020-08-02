package day15_String;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName =scan.next();

     //   String fullName = firstName.concat(" ".cocncat(lastName);
        String fullName = firstName+" "+lastName;
     //   System.out.println("Your full name is: ".concat(fullName));
        System.out.println("Your full name is: "+ fullName);

    }



}

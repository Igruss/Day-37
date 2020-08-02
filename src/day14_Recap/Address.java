package day14_Recap;
import com.sun.xml.internal.ws.model.wsdl.WSDLOutputImpl;

import java.util.Scanner;
/*
  2. write a program for the shipping info that, the program should ask:
                    building number
                    Street address (Assume it has more than one word)
                    city name
                    state name
                    zip code
                    full name of the person:
            and prints the ship to info in the following format:
            ex output:
                    Ship To:  Jimmy joe
                              7925 Jones Branch Dr
                              MCLean, VA 22102

 */
public class Address {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter building number:");
        int buildingNum = input.nextInt();
        input.nextLine();

        System.out.println("Enter Street address:");
        String streetAddress = input.nextLine();

        System.out.println("Enter City name:");
        String city = input.nextLine();

        System.out.println("Enter State name:");
        String state = input.nextLine();

        System.out.println("Enter zip code:");
        int zipCode = input.nextInt();
        input.nextLine();

        System.out.println("Enter full name:");
        String fullName = input.nextLine();

        System.out.println("\nShip to: "+fullName+"\n"+buildingNum+" "+streetAddress+"\n"+city+", "+state+" "+zipCode);








    }




}

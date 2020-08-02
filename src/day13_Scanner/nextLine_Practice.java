package day13_Scanner;
import java.util.Scanner;
public class nextLine_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your building number: ");
        int buldingNumber = scan.nextInt();

        scan.nextLine();

        System.out.println("Enter your street name: ");
        String streetName = scan.nextLine();
        System.out.println("Enter City name");
        String city = scan.nextLine();

        System.out.println(buldingNumber+" "+streetName);
        System.out.println(city);

        scan.close();








    }




}

package day24_Arrays;

import java.util.Scanner;

public class Uniques2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String str = scan.next();
        String expectedResulrt = "";

        for(int j = 0;j <str.length(); j ++) { // we need freq of avery single char

            char ch1 = str.charAt(0);
            int count1 = 0;

            for (int i = 0; i < str.length(); i++) { // used for finding the frequency of the ch and assighm it
                char each = str.charAt(i);
                if (ch1 == each) {
                    count1 += 1;
                }
            }
                 if (count1 == 1) { // it only occured one time
                     expectedResulrt += ch1;
                 }
        }

        System.out.println(expectedResulrt);
    }
}

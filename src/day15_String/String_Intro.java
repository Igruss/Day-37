package day15_String;

import java.lang.String;
import java.util.Scanner;

public class String_Intro {

    public static void main(String[] args) {
        String str = "Cybertek";
        Scanner input = new Scanner(System.in);

        String c1 = "Cat"; //Returns literal string as the same and prints one;
        String c2 = "Cat";  //NEVER DUPLICATE and is in STRING POOL
        System.out.println(c1==c2);

        String t1 = new String("tiger"); // ALWAYS RETURNS IN JAVA AS a DIFFERENT string
        String t2 = new String("tiger"); //STRING HEAP
        System.out.println(t1==t2);










    }
}

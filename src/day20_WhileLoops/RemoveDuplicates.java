package day20_WhileLoops;

import java.util.Scanner;

/*
 write a program that can remove the duplicates from any given String
            Ex:
                input: abcabcaabb
                output: abc
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        String result = "";

        for(int i = 0; i<=str.length()-1;i++){
            String s =""+str.charAt(i);
            if(!result.contains(s)){
                result +=s;
            }
        }

        System.out.println(result);




    }



}

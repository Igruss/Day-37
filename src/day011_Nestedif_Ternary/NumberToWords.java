package day011_Nestedif_Ternary;
/*
    1. write a java program that can convert numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".
 */
public class NumberToWords {

    public static void main(String[] args) {

        int num = 8;
        String result = "";

        if (num == 0) {
            result = "zero";
        } else if (num == 1) {
            result = "one";
        }else if (num == 2){
            result = "two";
        } else if (num == 3) {
            result = "three";
        } else if (num == 4) {
            result= " four";
        } else if (num == 5) {
            result ="five";
        } else if (num == 6) {
            result= "six";
        } else if (num == 7) {
            result="seven";
        } else if (num == 8) {
            result="eight";
        } else if (num == 9) {
            result="nine";
        }else{
            result="Invalid";
        }

        System.out.println(result);

        String result2=(num == 0) ? "Zero" : (num == 1) ? "One" : (num == 2) ? " Two" : (num == 3) ? "Three" : (num == 4) ?
                "Four" : (num == 5) ? "Five" : (num == 6) ? "Six" :(num == 7) ? "Seven" : (num == 8) ? "Eight" :
                (num == 9) ? "Nine" : "Invalid";

        System.out.println(result2);










    }




}





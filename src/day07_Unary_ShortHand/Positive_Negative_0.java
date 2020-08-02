package day07_Unary_ShortHand;
/*
write a program that can verify if a number is positive, negative, 0
 */
public class Positive_Negative_0 {
    public static void main(String[] args) {

        int num1=342;

        boolean positive= num1 >0;
        boolean negative = num1<0;
        boolean zero= num1 ==0;

        System.out.println(num1+" is a positive number? : "+positive);
        System.out.println(num1+" is a negative number? : "+negative);
        System.out.println(num1+" is equal to zero? : "+zero);


    }



}

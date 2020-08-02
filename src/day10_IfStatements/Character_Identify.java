package day10_IfStatements;
/*
write a program that can identify if the given character character is Alphabetic
            ex:
                character = 'a'
            output:
                a is an Alphabetic
                character  = '!'
            output:
                ! is not  anAlphabetic
        Hint:
                ascii table:
                        65 ~ 90 ==> A~Z
                        97 ~ 122 ==> a~z
 */
public class Character_Identify {

    public static void main(String[] args) {

        char character ='&';

        boolean isAlphabetic = (character>=65 && character <=90) || (character>= 97 && character <=122);
        String alphabet =" ";

        boolean isDigit =character >= 48 && character <= 57;
        String digit ="";

        boolean specialChar = !isAlphabetic && !isDigit;
        String simbol =" ";

        // This is 1 way
        if (isAlphabetic) {
           // System.out.println(character+" is Alphabetic character");
            alphabet=character + " is Alphabetic character";
        }else{
          //  System.out.println(character+" is not Alphabetic character");
            alphabet=character + " is not Alphabetic character" ;
        }

        System.out.println(alphabet);

        if (isDigit == true) {
            digit = character + " is a digit";
        }else{
            digit = character + " is not digit";
        }

        System.out.println(digit);

        if (specialChar == true) {
            simbol = character + " is a special character";
        }else{
            simbol = character + " is not a special character";
        }

        System.out.println(simbol);





















    }




}

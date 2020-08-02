package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Remove_Digits_Letters {
    public static void main(String[] args) {

        ArrayList<Character> chars = new ArrayList<>();
        chars.addAll(Arrays.asList('a','1','b','2','$','#','&'));

        chars.removeIf(p -> Character.isDigit(p) || Character.isLetter(p));

        System.out.println(chars);

        System.out.println("==================================");

        ArrayList<Character> list = new ArrayList<>();
        list.addAll(Arrays.asList('a','1','b','2','$','#','&','*','7'));

        ArrayList<Character> digits = new ArrayList<>();
        digits.addAll(list);
        digits.removeIf(p -> !Character.isDigit(p));
        System.out.println("digits : " +digits);

        ArrayList<Character> letters = new ArrayList<>();
        letters.addAll(list);
        letters.removeIf(p -> !Character.isLetter(p));
        System.out.println("letters: "+ letters);

        ArrayList<Character> specials = new ArrayList<>();
        specials.addAll(list);
        specials.removeIf(p ->  Character.isLetterOrDigit(p));
        System.out.println("specials : "+specials);









    }
}

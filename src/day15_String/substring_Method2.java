package day15_String;

public class substring_Method2 {

    public static void main(String[] args) {
        String lastName = "rastAFaRAy";
        String firstChar = lastName.substring(0,1);
        String remaining = lastName.substring(1);// creates substring from beg to the end

       lastName= firstChar.toUpperCase()+remaining.toLowerCase();

        System.out.println(firstChar);
        System.out.println(remaining);
        System.out.println(lastName);

        System.out.println("===========================");

        String s = "I like GAme of Thrones";
        String series = s.substring(7);
        System.out.println(series);
        System.out.println("=========================");

        String s2 = "I like Java Programing Language";

        String language =s2.substring(7);
        System.out.println(language);









    }




}

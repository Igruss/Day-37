package day17_StringReview;

public class String_Methods {

    public static void main(String[] args) {

        String str = "Cybertek";

        char ch1 = str.charAt(1);
        System.out.println(ch1);

        String str2 = "Cybertek";
        str2 = str2 + " School";
        System.out.println(str2);

        //length ====> int
        String str3 = "Cybertek School";
        int l = str3.length()-1;//lastIndex : length -1
        System.out.println(l);

        char ch2 = str3.charAt(9);
        System.out.println(ch2);

        //substring:

        String str7 = "I like Java Language";
               str7 = str7.substring(7,11)+ " "+ str7.substring(2,7);

        System.out.println(str7);

       // indexOf & lastIndexOf ===> int

        String str8 = "Hello Batch 20, Have a wonderful day, we are happy to see you";
         int i1 = str8.indexOf("w");
        System.out.println(i1);

        int i2 = str8.indexOf(", w") + 2;
        int i3 = str8.indexOf("ha");
        System.out.println(i2);
        System.out.println(i3);

        String str9 = "Java Java Java";
        int i4 = str9.lastIndexOf("J");
        int i5 = str9.indexOf(" Java ")+1;
        System.out.println(i4);
        System.out.println(i5);

        // replace & replaceFirst
        String s1 = "Java is a programming language";
        s1 = s1.replace("Java","C#");
        System.out.println(s1);






    }



}

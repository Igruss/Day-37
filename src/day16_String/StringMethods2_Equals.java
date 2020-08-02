package day16_String;

public class StringMethods2_Equals {
    public static void main(String[] args) {

        String name1 = "Cybertek";
        System.out.println(name1.isEmpty());

        String str1 = "Java";
        String str2 = new String("Java");

        System.out.println(str1 +" : "+str2);

        System.out.println(str1.equals(str2));
//   checks if the string is true or not (returns boolean)-cannot ignore case sensitivity
        String str3 = new String("Java");
        String str4 = new String("Java");

        System.out.println(str3.equals(str4));

        String str5 = "Java";
        String str6 = "Java";

        System.out.println(str5 == str6);
        System.out.println(str5.equals(str6));

        String str7 = "JAVA";
        System.out.println(str6.equals(str7));

        //contains : checks if the given String is contained or not (returns boolean);
        String str = "I like to learn Java programming language";

        System.out.println(str.contains("python"));
        System.out.println(str.contains("Java"));

        // startsWith(): cheks if  String started with the given string (returns boolean);
        String s1 = "Igor";
        System.out.println(s1.startsWith("I"));











    }



}

package day15_String;

public class substring_Method {
    public static void main(String[] args) {
        String sentence = "Java is a fun";
                         //0123456789......
        // substring(beg index, end index)
        String word = sentence.substring(5,7);
        System.out.println(word);

        String word2 = sentence.substring(10,13);
        System.out.println(word2);

        String sentece2 = "I like Movies and TV Series";
        String word3 = sentece2.substring(7,13);
        System.out.println(word3);

        System.out.println("=============================");

        String firstName ="sUUUperSarr";
        String firstCharacter = firstName.substring(0,1);
        String rest = firstName.substring(1,firstName.length());//
        System.out.println(rest);

        System.out.println("===============================");
        firstName = firstCharacter.toUpperCase() + rest.toLowerCase();
       System.out.println(firstName);

}
}










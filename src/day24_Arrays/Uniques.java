package day24_Arrays;
/*
write a program that can find the unique characters from a String
        Ex:
            input: aabccd
            output: bd

 */
public class Uniques {

    public static void main(String[] args) {

        String str = "aabccffdllcxszbaofdoe";

        String unique = ""; // 'b'

        for(int i =0;i <str.length(); i++){
         char ch = str.charAt(i);
         int first = str.indexOf(ch);
         int last = str.lastIndexOf(ch);

            if (first == last) {
                unique += ch;
            }
        }

        System.out.println(unique);





    }
}

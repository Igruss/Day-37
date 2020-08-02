package day31_Recap;
/*
    1.  write a return method called frequency that accepts two parameters: string str and char ch, the method returns the frequency of the ch from the str as an int
            Ex:
                frequency("AAA", 'A') ==>  3
                frequency("ABAB", 'B') ==> 2
            Note: MUST use Arrays and for each loop

 */
public class WarmupTasks {

    public static void main(String[] args) {

        System.out.println("==================================");
        String str2= "pppdwiffjvkdoioowmv";
        String uniques2 =uniques(str2);
        System.out.println(uniques2);



    }

    public static int frequency(String str, char ch) {
        int count = 0;
        for (char each : str.toCharArray()) {
            if (each == ch) {
                count++;
            }
        }
        return count;

    }

    public static String uniques(String str) {
        String uniques = "";

        for (char each : str.toCharArray()) {
            int count = frequency(str, each);
            if (count == 1) {
                uniques += each;
            }
        }
        return uniques;

    }

}

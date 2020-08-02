package day31_Recap;
import Library.Util;
public class FrequencyOfCharacters {

    public static void main(String[] args) {
        String str ="AABBBCCnjhgyfjfghdddhghhjjjttttesC";
        String expectedResult = "";
        String nonDup = Util.removeDup(str);
        System.out.println(nonDup);
/*
        for(int i =0;i<=nonDup.length()-1;i++){
            char ch1 = nonDup.charAt(i);
            int count = Util.frequency(str,ch1);
            expectedResult += ""+ch1 + count ;
        }
*/



        for(char each : nonDup.toCharArray()){
            int count1 = Util.frequency(str,each);
            expectedResult += "" + each +count1;
        }

/*        char ch1 = nonDup.charAt(0);
        int count = Util.frequency(str,ch1);
        expectedResult += ""+ch1 + count ;
*/
        System.out.println(expectedResult);



    }

    public static String frequencyOfChars (String str ){
        String expectedResult = "";
        String nonDup = Util.removeDup(str);

/*
        for(int i =0;i<=nonDup.length()-1;i++){
            char ch1 = nonDup.charAt(i);
            int count = Util.frequency(str,ch1);
            expectedResult += ""+ch1 + count ;
        }
*/



        for(char each : nonDup.toCharArray()){
            int count1 = Util.frequency(str,each);
            expectedResult += "" + each +count1;
        }
        return expectedResult ;

/*        char ch1 = nonDup.charAt(0);
        int count = Util.frequency(str,ch1);
        expectedResult += ""+ch1 + count ;
*/


    }


}

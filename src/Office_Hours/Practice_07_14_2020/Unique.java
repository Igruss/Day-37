package Office_Hours.Practice_07_14_2020;

public class Unique {

    public static void main(String[] args) {

        String str ="ABABC";
        String expectedResult="";

        for(int j =0;j<=str.length()-1;j++){// outher loop calculates every character
            char ch = str.charAt(j);
            int count = 0;
            for(int i = 0;i <=str.length()-1;i++){ //inner loop calculates the frequency of char
                char each = str.charAt(i);
                if(each == ch){
                    count +=1;
                }
            }

            if (count == 1) { // finding uniques
                expectedResult += ch;
            }
        }
        System.out.println(expectedResult);




    }
}

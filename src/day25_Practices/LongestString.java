package day25_Practices;
//    1. Write a program that can return the longest string of text from a String array
public class LongestString {

    public static void main(String[] args) {

        String [] arr = {"Anam","Nickolas","Amir","Nurmamet","Abi","Ali","Joe"};

        int maxLength = arr[0].length();

        for(String each : arr){
            if(each.length() > maxLength){
                maxLength = each.length();
            }
        }

        for(String each : arr){
            if(each.length()== maxLength){
                System.out.println(each);
            }
        }


    }
}

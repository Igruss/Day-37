package day25_Practices;
//  Write a program that can return the shortest string of text from a String array
public class ShortesString {

    public static void main(String[] args) {

        String [] arr = {"Anam","Nickolas","Amir","Nurmamet","Abi","Ali","Joe"};
        int minLength = arr[0].length();

        for(int i =0; i<=arr.length-1;i ++){
            int l =arr[i].length();
            if(l<minLength){
                minLength = l;
            }

        }

        for(int i =0; i<=arr.length-1;i ++){
            if (arr[i].length() == minLength){
                System.out.println(arr[i]);
            }
        }



    }
}

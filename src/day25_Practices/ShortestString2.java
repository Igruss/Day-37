package day25_Practices;

public class ShortestString2 {


    public static void main(String[] args) {

        String [] arr = {"Anam","Nickolas","Amir","Nurmamet","Abi","Ali","Joe"};
        int minLength = arr[0].length();

        for(String each : arr){
            int l =each.length();
            if(l<minLength){
                minLength = l;
            }

        }

        for(String each : arr){
            if (each.length() == minLength){
                System.out.println(each);
            }
        }





    }
}

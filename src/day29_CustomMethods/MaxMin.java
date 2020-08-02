package day29_CustomMethods;
/*
    11. wirte a method that can print out the maximum number from any array of integers
    12. wirte a method that can print out the minimum number from any array of integers
 */
public class MaxMin {

    public static void main(String[] args) {

        int [] arr = {1,33,55,66,9475,23895,3,5566,2};
        maxNum(arr);
        minNum(arr);

    }

    public static void maxNum(int [] arr){
        int max = arr[0];
        for(int each : arr ){
           if (each > max){
               max =each;
           }
        }
        System.out.println("Max is: "+max);
    }

    public static void minNum(int [] arr){

             int min = arr[0];
            for(int each : arr ){
                if (each < min){
                    min =each;
                }
            }
            System.out.println("Max is: "+min);
        }
    }







package day24_Arrays;

public class ForEachLoop {

    public static void main(String[] args) {
     // for(DataTYpe each : Collection of data)
        int []arr = {1,2,3,4,5,6,7,8,9,-1,-2,-3};

        for(int i =0; i <= arr.length-1 ; i ++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("=============================");

        for(int each : arr ){ // each represents the elements
            System.out.print(each+" "); //DataType MUST mach with ARRAY dataType

        }

        System.out.println();

        System.out.println("=============================");

        String [] group = {"Banu","Berk","Milan","Alexandre","Vildan","Abdennour","Bolor","Fatih","Grace","Festine"};

        for(String each : group){
            System.out.print(each +" ");
        }





    }
}

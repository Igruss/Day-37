package day29_CustomMethods;
////    8. write a method that can print out the unique elements from an array of string
public class UniqueElements {
    public static void main(String[] args) {

        String [] arr = {"A", "A", "B", "C", "C"};
        uniques(arr);

        String [] arr2 ={"D","D","E","F","F"};
        uniques(arr2);

    }

    public static void uniques (String [] arr){


        for(String a : arr){

            int count =0;

            for(String each : arr){
                if(a.equals(each)){
                    count++;
                }
            }
            if(count ==1){
                System.out.println(a);
            }
        }
        System.out.println();


    }

}

package Office_Hours.Practice_07_14_2020;

public class UniqueNumbers {


    public static void main(String[] args) {

        int [] arr1 ={1,1,2,3,3,2,4,5,6,8,4,7,8,5,3,5,2,2,6,3};

        for(int b :arr1){
            int num = arr1[b];
            int count = 0;

            for(int each : arr1){
                if (each == num) {
                    count+=1;
                }
            }
            if (count == 1) {
                System.out.println(b);
            }
        }



    }
}

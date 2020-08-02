package day023_Arrays;
/*
int[] arr = {10,20, 3,4,5,6,7,-10,-100, 300, 400};
write a program that can return the min and maximum number from the array
 */
public class Max_Min {

    public static void main(String[] args) {

        int[] arr = {10,20, 3,4,5,6,7,-10,-100, 300, 400};

        int max = arr[0];
        int min = arr[0];

         for(int i = 0 ; i <= arr.length -1; i ++){
             if(arr[i] > max){ //compares the array elements and assign the max num to variable min
                 max = arr[i];
             if(arr[i]< min){
                 min = arr[i];
             }

             }
         }
        System.out.println("Maximum num is: "+max);
        System.out.println("Minimum num is: "+min);








    }
}

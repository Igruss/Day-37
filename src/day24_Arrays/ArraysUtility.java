package day24_Arrays;
import java.util.Arrays;
public class ArraysUtility {

    public static void main(String[] args) {

        int [] arr ={1,2,3};
        System.out.println(Arrays.toString(arr));

        String names [] = {"Muhtar","Saim","Nadir","Asiya","Kuzzat"};
        System.out.println(names);// in order to print array variable MUST convert to String
        System.out.println(Arrays.toString(names));

        System.out.println("=============================");

        int [] nums = {5,4,6,4,3,10,9,1,3,677,3456,2};

        Arrays.sort(nums); // sort the int to ascending order

        System.out.println(Arrays.toString(nums));

        System.out.println("Max num is: " + nums[nums.length-1]);

        System.out.println("Min num is: " + nums[0]);

        String students []= {"Mehdi","Elkem","Meeee","Trump"};

        Arrays.sort(students);

        System.out.println(Arrays.toString(students));

        System.out.println("==============================");

        int [] arr1 = {1,2,3};
        int [] arr2 = {1,2,3};

       boolean r1 = Arrays.equals(arr1,arr2);

        System.out.println(r1);

        int [] arr3 = {2,1,3};
        Arrays.sort(arr1);
        Arrays.sort(arr3);

        boolean r2 = Arrays.equals(arr1,arr3);

        System.out.println(r2);

        int arr4 []= {1,1,2,3};
        int [] arr5 = {1,2,3};

        boolean r3 = Arrays.equals(arr4,arr5);
        System.out.println(r3);




    }
}

package day26Multi_DimensionalArrays;

import java.util.Arrays;

public class MultiD_Array {

    public static void main(String[] args) {

        char[]ch1 ={'A','B'};
        char[]ch2 ={'C','D','E'};
        char[]ch3 ={'F','G','H'};

        char [][] ch2D = {{'A','B'},{'C','D','E'},{'F','G','H'}};
//first bracket is for the 1D Array,second is for the elements in the Array
        System.out.println(Arrays.toString(ch2D[1]));

        System.out.println(ch2D[2] [2]);

        System.out.println(ch2D [2][1]+" "+ch2D[0][1]);

        System.out.println("==========================================");

        int [][] nums ={{1,2,3},{4},{5,6},{7,8,9,10}};

        System.out.println(Arrays.toString(nums [3]));
        System.out.println();

        for(int [] each : nums) {
            System.out.println(Arrays.toString(each));
        }
        System.out.println("============================");

        System.out.println(Arrays.deepToString(nums));//prints whole multi D Array

    }
}

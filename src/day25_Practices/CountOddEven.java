package day25_Practices;
//Write a program that can count the even and odd number from an array of integers
public class CountOddEven {


    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,6,7,8,9,10,11};
        int countEven = 0;
        int countOdd = 0;

        String even = "";
        String odd = "";

        for(int each : nums){
      /*      if(each %2 ==0){
                countEven +=1;
            }else{
                countOdd ++;
            }*/   if(each %2 ==0){
                countEven +=1;
                even += each +" ";
                continue;
            }
                countOdd ++;
                 odd += each +" ";

        }
        System.out.println("Even numbers: "+countEven);
        System.out.println(even);
        System.out.println("Odd numbers: "+countOdd);
        System.out.println(odd);


    }
}

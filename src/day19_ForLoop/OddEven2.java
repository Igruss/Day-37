package day19_ForLoop;

public class OddEven2 {

    public static void main(String[] args) {

        for(int i =0;i <=50;i ++){
            if(i % 2 !=0){
                continue; // if the num is even , than skip odd
            }
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i =0;i <=50;i ++){
            if(i % 2 ==0){
                continue; // if the num is odd , than skip even
            }
            System.out.print(i + " ");
        }


    }





}

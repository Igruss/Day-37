package day28_Recap;

public class LoopsQuiz {
    public static void main(String[] args) {
        int a = 0;

        while(a <=6){
            a+=2;
        }

        System.out.println(a);

        System.out.println("==========================");
        int i =0;
        int j =7;

        for(i=0;i < j-1;i +=2){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("========================");

        int z = 5;
        for(int q =0;q>0;q--){
             z +=q;
        }
        System.out.println(z);



    }

}

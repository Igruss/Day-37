package day27_recap;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        String [] names = {"Odina","Emine","Berk","Nadir"};

        Arrays.sort(names);

        int [] score ={60,99,48,88,32,6};

        Arrays.sort(score);
        System.out.println(Arrays.toString(score));


        System.out.println("Maximum : "+score[score.length -1]);
        System.out.println("Minimum : "+score[0]);

        System.out.println("======================================");

        String [] s1 ={"A","B","C"};
        String [] s2 ={"A","B","C"};

        System.out.println(Arrays.equals(s1,s2));

        String [] a1 = {"A","B","C"};
        String [] a2 = {"B","C","A"};

        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println(Arrays.equals(a1,a2));

        String w1 = Arrays.toString(a1);

        System.out.println(w1);


    }
}

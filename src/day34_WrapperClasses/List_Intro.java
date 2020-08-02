package day34_WrapperClasses;

import java.util.ArrayList;

public class List_Intro {

    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<Integer>();

              scores.add(95); //autoboxing
              scores.add(100);
              scores.add(85);
              scores.add(1,45);

        System.out.println(scores);

        System.out.println(scores.get(2)); // takes value

        System.out.println(scores.size());

    }
}

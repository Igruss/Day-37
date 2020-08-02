package day36_ArraysList;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.Arrays;

public class RemuveDuplicates {

    public static void main(String[] args) {

        ArrayList<Character> list = new ArrayList<>();
            list.addAll(Arrays.asList('A','A','B','B','C','C'));

        System.out.println(list);

        ArrayList<Character>  nonDup = new ArrayList<>();

        for(Character each : list){
            if(!nonDup.contains(each)){
                nonDup.add(each);
            }
        }
        System.out.println(nonDup);


    }
}

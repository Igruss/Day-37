package day36_ArraysList;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_Practice {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(15);

        Collections.sort(list);

        System.out.println(list);

        ArrayList<Integer>descendingList = new ArrayList<>();

        for(int i = list.size()-1;i >=0; i--){
            System.out.print(list.get(i)+" ");
            descendingList.add(list.get(i));

        }
        System.out.print(descendingList);

    }
}

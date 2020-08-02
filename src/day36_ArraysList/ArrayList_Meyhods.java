package day36_ArraysList;

import java.util.ArrayList;

public class ArrayList_Meyhods {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

          list.add(10);
          list.add(20);
          list.add(30);
          list.add(40);
          list.add(50);
          list.add(40);


        list.indexOf(40);
        int a = list.indexOf(40);

        System.out.println(a);

        System.out.println(list.indexOf(60));

        System.out.println(list.lastIndexOf(40));

        boolean r1 = list.contains(100);

        System.out.println(r1);

        System.out.println("+===============================");

        ArrayList<String > list1 = new ArrayList<>();
        list1.add("Cybertek");

        ArrayList<String > list2 = new ArrayList<>();
        list2.add("Cybertek");

        System.out.println(list1.equals(list2));

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(10);

        System.out.println(list3.isEmpty());






    }
}

package day35_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {

    public static void main(String[] args) {

        ArrayList<String> earlyBirdList = new ArrayList<>();

        earlyBirdList.add("Virginia");
        earlyBirdList.add("Ibrahim");
        earlyBirdList.add("Ziiadin");
        earlyBirdList.add("VErfan");
        earlyBirdList.add("Aalia");

        earlyBirdList.set(2,"Aslan");// replaces the element
        earlyBirdList.set(0,"Ian");
        System.out.println(earlyBirdList);

        earlyBirdList.clear(); // clears everything

        System.out.println(earlyBirdList);

        System.out.println("==================================");

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.remove(1);// when pass primitive method it returns int

        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        Integer a = 1;
        int b =2 ; // removes primitive

        //list2.remove(a);// removes element (because is not primitive)
        list2.remove(b);
        System.out.println(list2);

        System.out.println("+==============================");

        ArrayList<String> list3 = new ArrayList<>();

        list3.add("Hamid");
        list3.add("Lillia");
        list3.add("Bulent");
        list3.add("Viorel");
        list3.add("Musa");

        list3.remove(2);// can do both ways still works but its case sensitive
        list3.remove("Bullent");


        System.out.println(list3);









    }
}

package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(30,20,55,6,100,67,99,-34,-7,699));

        Integer max = Collections.max(list);
        Integer min = Collections.min(list);

        System.out.println("Max number is : " + max);
        System.out.println("Min number is : " + min);

        System.out.println("==============================");
        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Muhtar","Saim","Islem","Jesus","Muhtar","Asiya"));

        Collections.replaceAll(names,"Muhtar","Fatime");

        System.out.println(names);

    }

}

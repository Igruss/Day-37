package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

               list.add(1);
               list.add(2);
               list.add(3);
               list.add(4);

        boolean r1 = list.containsAll(Arrays.asList(1,2,4));

        System.out.println(r1);

        System.out.println("=======================");

        ArrayList<Integer> numbers = new ArrayList<>();
        // add : 30,25,40,15,65,75,85,95,100
        Integer [] nums = {30,25,40,15,65,75,85,95,100};
        numbers.addAll(Arrays.asList(nums));

        System.out.println(numbers);


    }
}

package Office_Hours.Practice_10_28_2020;

import java.util.*;

/*

 * Create a method will take an Integer ArrayList and remove any duplicates values.
  Return an ArrayList of unique elements.

 */
public class Duplicates {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(3,44,3,21,11,5,5,7,4,11));
        System.out.println(removeDup(list));
        System.out.println(new HashSet<>(list));

    }

    public static ArrayList<Integer>removeDup(ArrayList<Integer> nums){
        ArrayList<Integer> uniqueValues = new ArrayList<>();
        for(Integer each : nums){
            if(!uniqueValues.contains(each)){
                uniqueValues.add(each);
            }
        }
        return uniqueValues;
    }

    public static ArrayList<Integer> removeDup2(ArrayList<Integer> nums){

        return new ArrayList<>(new LinkedHashSet<>(nums));
    }

}

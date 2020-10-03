package day60_Collection;

import java.util.*;

public class SetInterface {

    public static void main(String[] args) {

        Set<Integer> s1 = new HashSet<>();

        s1.addAll(Arrays.asList(8,5,6,3,4,10,7,1,null)); // does not keep insertion order(makes it from min to max)
        s1.addAll(Arrays.asList(8,8,8,8,8,8,8,8,8,8)); // does not accept duplicates

        System.out.println("HashSet : " +s1);

        Set<Integer> s2 = new LinkedHashSet<>();

        s2.addAll(Arrays.asList(8,5,6,3,4,10,7,1,null)); //  keep insertion order as it is
        s2.addAll(Arrays.asList(8,8,8,8,8,8,8,8,8,8)); // does not accept duplicates

        System.out.println("Linked HashSet: " +s2);

        Set<Integer> s3 = new TreeSet<>();

        s3.addAll(Arrays.asList(8,5,6,3,4,10,7,1)); // does not keep insertion order(but not null(default value))

        System.out.println("TreeSet: " +s3);





    }

}

package day61_Maps;

import java.time.LocalDate;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class IteratingKeysValues {

    public static void main(String[] args) {

        Map<String , LocalDate> students = new TreeMap<>();

        students.put("Hasan", LocalDate.of(1985,4,4));
        students.put("Raya", LocalDate.of(1989,6,11));
        students.put("Muhtar", LocalDate.of(1985,5,24));
        students.put("Aljonce", LocalDate.of(1988,3,5));
        students.put("Rull",LocalDate.of(1980,11,6));// NO Duplicates
        students.put("Aljonce", LocalDate.of(1988,3,5));

        System.out.println(students);

       // Set<String> keys = students.keySet();

        for(String each : students.keySet()){
            System.out.println(each);
        }

        System.out.println("=============================================");

        for( LocalDate each : students.values()){
            System.out.println(each);
        }



    }


}

package day37_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Practice {

    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();

        students.add("Sayeem");
        students.add("Waqar");
        students.add("Beslan");
        students.add("Dawud");
        students.add("Ramazan");
        students.add("Mehary");

       boolean r1 = students.containsAll(Arrays.asList("Ulku","Busra","Muhtar"));

        System.out.println(r1);

        ArrayList<String> group1 = new ArrayList<>();

        group1.addAll(Arrays.asList("Banu","Vildan","Amir","Askat","Ayse","Diell","Hamit","Minara"));

        boolean r2 = group1.containsAll(Arrays.asList("Mike","Pete"));

        System.out.println( r2);

        System.out.println("=====================================");


        ArrayList<String> employee = new ArrayList<>();
        employee.addAll(Arrays.asList("Ahmed","Muhtar","Ahmed","Virginia","Beslan"));

       // employee.removeAll(Arrays.asList("Ahmed"));removes element
        employee.retainAll(Arrays.asList("Ahmed"));//retain element
        System.out.println(employee);




    }
}

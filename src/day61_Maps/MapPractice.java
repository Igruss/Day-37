package day61_Maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapPractice {

    public static void main(String[] args) {

        Map<String , Double> employees = new LinkedHashMap<>();

        employees.put("Elvira",100000.0);
        employees.put("Elv",120000.0);// If the keyes (Names) are duplicate(Value can be) it prints only last one
        employees.put("Elvir",130000.0);// If not prints the actual size

        System.out.println(employees);
        System.out.println(employees.size());

        System.out.println("Salary of Elvira: "+ employees.get("Elvira"));

        employees.remove("Elvira");

        System.out.println(employees);
        System.out.println(employees.size());

        boolean r1 = employees.containsKey("Elv");

        System.out.println(r1);

        boolean r2 = employees.containsValue(120000.0);

        System.out.println(r2);

        employees.clear();

        System.out.println(employees);

    }


}

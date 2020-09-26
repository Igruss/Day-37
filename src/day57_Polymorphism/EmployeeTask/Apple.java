package day57_Polymorphism.EmployeeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Apple {

    public static void main(String[] args) {

       Employee tester1= new Tester("Andrii",516875,"QA",120000,'M');
       Employee tester2 = new Tester("Marinna",123456, "SDET",120_000, 'F');

       Employee developer1 = new Developer("fatime",23444,"Software ING",156000,'f');
       Employee developer2 = new Developer("Abdul",123456789,"Dev Lead",110000,'M');

       Employee scrumMaster1 = new ScrumMaster("Isabel",891234, "Scrum Master", 124_000, 'F');

        ArrayList<Employee>scrumTeam = new ArrayList<>();
        scrumTeam.addAll((Arrays.asList(tester1,tester2,developer1,developer2,scrumMaster1)));

        for(Employee each : scrumTeam){
            System.out.println(each);
        }


    }
}

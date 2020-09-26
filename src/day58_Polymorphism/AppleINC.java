package day58_Polymorphism;
/*
   create a class called AppleINC
    copy the folowing array of Employee:
            Employee[] workers =  {
                    new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                    new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                    new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                    new Developer("Abdul",123456789,"QA",110000,'M'),
                    new Developer("Abdul",123456789,"QA",110000,'M'),
                    new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                    new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                    new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                    new Developer("Abdul",123456789,"QA",110000,'M'),
                    new Developer("Abdul",123456789,"QA",110000,'M'),
                    new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                    new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                    new Developer("Abdul",123456789,"QA",110000,'M'),
                    new ScrumMaster("Kamil", 78945, "Scrum Master", 120000, 'M')
                    new Developer("Abdul",123456789,"QA",110000,'M'),
                    new Developer("Abdul",123456789,"QA",110000,'M'),
                    new Developer("Abdul",123456789,"QA",110000,'M'),
                    new Developer("Abdul",123456789,"QA",110000,'M'),
                    new ScrumMaster("Kamil", 78945, "Scrum Master", 120000, 'M')
                    new Developer("Abdul",123456789,"QA",110000,'M'),
                    new Developer("Abdul",123456789,"QA",110000,'M'),
                    new Developer("Abdul",123456789,"QA",110000,'M'),
                    new Developer("Abdul",123456789,"QA",110000,'M')
            };
            (change the informations of the employees by yourself)
            create an arraylist of employee named scrumTeam and store all the employee objects from workers
            write a program that can find  how many testers, developers and Scrum master in scrum team

 */
import day57_Polymorphism.EmployeeTask.*;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleINC {

    public static void main(String[] args) {

        Employee [] workers = {
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new ScrumMaster("Kamil", 78945, "Scrum Master", 120000, 'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new ScrumMaster("Kamil", 78945, "Scrum Master", 120000, 'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M'),
                new Developer("Abdul",123456789,"QA",110000,'M')

        };

        ArrayList<Employee> scrumTeam = new ArrayList<>(Arrays.asList(workers));
        int countTester = 0;
        int countDeveloper = 0;
        int countScrumMaster = 0;

        for (Employee each : scrumTeam){
            if(each instanceof  Tester){
                countTester ++;
            }else if (each instanceof Developer){
                countDeveloper ++;
            }else {
                countScrumMaster++;
            }
        }


        System.out.println("Tester: "+countTester);
        System.out.println("Developer: "+countDeveloper);
        System.out.println("Scrum Master: "+countScrumMaster);



    }

}

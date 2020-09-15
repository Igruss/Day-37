package day54_Abstraction.EmployeeTask;

import java.time.LocalDate;

public class PenFed {

    public static void main(String[] args) {


        Tester tester1 = new Tester("Polat Alemdar",'M', LocalDate.of(1973,11,20),"KABADAYI",1500000);

        System.out.println(tester1.gender);
        System.out.println(tester1.DOfB);

        Developer developer1 = new Developer("Virginia",'F',LocalDate.of(1993,11,25),"SDET",150000);

        System.out.println(developer1);

    }
}

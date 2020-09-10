package day53_finalKeyword;

import java.time.LocalDate;

public class FinalVariable {

    final static String eyeColor = "Brown";
    final String bloodType = "A+";

    final int x;
    final static int y;

    static {
        y=300;
    }
    public FinalVariable(){
        x = 100;
    }

    public static void main(String[] args) {

      final  LocalDate dateOfBirth = LocalDate.of(2000,5,7);

       // dateOfBirth = LocalDate.of(1990,6,5); cannot reassigned final variable

        System.out.println(dateOfBirth);

       final long ssn = 1234567;

        System.out.println(ssn);

        final double PI = 3.14;

        final String birthPlace = "Yugoslavia";



    }

}

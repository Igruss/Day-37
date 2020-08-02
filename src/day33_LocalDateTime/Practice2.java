package day33_LocalDateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Practice2 {

    public static void main(String[] args) {


        String [] students = {"Kalbi","Virginia","Odina","Ernis","Isa","Igor"};
        LocalDate[] birthDays = {LocalDate.of(1982,12,26),LocalDate.of(1993,11,25),
                LocalDate.of(1980,5,23),LocalDate.of(1990,2,21),
                LocalDate.of(1982,11,28),LocalDate.of(1980,11,6)};

        DateTimeFormatter DTF = DateTimeFormatter.ofPattern("MMMM/dd/yy EEEE");

        for(int i=0;i <= students.length-1;i++){
            System.out.println(students[i] + " : "+birthDays[i].format(DTF));
        }



    }
}

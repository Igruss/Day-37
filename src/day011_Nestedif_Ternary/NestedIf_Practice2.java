package day011_Nestedif_Ternary;

import java.util.jar.JarOutputStream;

public class NestedIf_Practice2 {
    public static void main(String[] args) {
        int num= 7;
        String day = "";

        if (num <=7 && num >= 0) {

       /*
            if (num == 1) {
                day = "Monday";
            } else if (num == 2) {
                day = "Tuesday";
            } else if (num == 3) {
                day = "Wednesday";
            } else if (num == 4) {
                day = "Thursday";
            } else if (num== 5) {
                day = "Friday";
            } else if (num == 6) {
                day = "Saturday";
            } else {
                day = "Sunday";
            }
          */
            day=(num == 7)? "Sunday" : (num== 6)? " Saturday" : (num == 5) ? "Friday" : (num == 4) ?
            "Thursday" :  (num== 3) ? " Wednesday" : (num== 2)? "Tuesday" : "Monday";

        }else{
            day = "Invalid";
        }
        System.out.println(day);

        int age=3;

        String result = "";
        if (age>=2 && age<=18){
            result=(age==2)? "toddler" : (age>=3 && age<6)? "early childhood" : (age>=6 && age<8)? "young reader" : (age>=8 && age<11)? "elementary":
                    (age>=11 && age<13)? "middle" : (age==13)? "impossible" : (age>=14 && age <17 )? "high school" : "scholar";
        }else{
            result="ineligible";
        }
        System.out.println(result);

        System.out.println("======================");
        int monthNum = 3;

        if(monthNum<=12 && monthNum >=0){
            result=(monthNum ==1)? "January" : (monthNum == 2)? "February" : (monthNum == 3)? "March" : (monthNum == 4)? "April" :(monthNum == 5)? "May":
                    (monthNum == 6)? "Jun" : (monthNum == 7)? "July" : (monthNum == 8)? "August" : (monthNum == 9)? "September" : (monthNum == 10)? "October" :
                            (monthNum == 11)? "November": "December";

        }else{
            result="invalid";
        }
        System.out.println(result);

        System.out.println("====================");
        int vehicleYear = 1997;

        if (vehicleYear >=1995 || vehicleYear <= 1998 || vehicleYear >= 2001 || vehicleYear <= 2002 || vehicleYear >= 2004 || vehicleYear <= 2006 ||
                vehicleYear >= 2015 || vehicleYear <= 2017){
            System.out.println("Your vehicle needs to be recalled!");
        }else{
            System.out.println("Your vehicle is fine, enjoy!");
        }


        if (num >= 0){
            System.out.println(num + " is positive");
        }else{
            System.out.println(num + " is negative");
        }






    }




}

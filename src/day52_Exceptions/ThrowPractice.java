package day52_Exceptions;

import java.time.LocalTime;

public class ThrowPractice {

    public static void main(String[] args) {

        String driverName = "chrome";

        if(driverName.equalsIgnoreCase("chrome")){
            System.out.println("Set up chrome");
        }else if(driverName.equalsIgnoreCase("firefox")){
            System.out.println("Set up firefox");
        }else if(driverName.equalsIgnoreCase("opera")){
            System.out.println("Set up opera");
        }else{
            throw new RuntimeException("Invalid browser name");
        }
        System.out.println("=======================================");

        if(LocalTime.now().getMinute()==45){
            throw new RuntimeException("It is BREAK time");
        }else{
            System.out.println("Continue");
        }

        throw new ArithmeticException();
       // throw new RuntimeException();


    }

}

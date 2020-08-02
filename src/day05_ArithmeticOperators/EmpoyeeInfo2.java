package day05_ArithmeticOperators;

import java.sql.SQLOutput;

public class EmpoyeeInfo2 {


    public static void main(String[] args) {

        String firstName="John";
        String lastName="Daniel";
        char gender='M';
        int age=39;
        String companyName="Verizon";
        String jobTitle="SDET";
        boolean isFullTime=true;
        boolean isMarried=false;
        double salary=99_678;
        String fullName=firstName+" "+lastName;

        System.out.println("Empoyee'"+" "+"full"+" "+"name"+" "+"is:"+" "+firstName+" "+lastName);
        System.out.println(fullName+"'s"+" "+"gender"+" "+"is: "+gender);
        System.out.println(fullName+"'s"+" "+"age"+" "+"is: "+age+" years old");
        System.out.println(fullName+" "+"works"+" "+"at: "+companyName);
        System.out.println( fullName+"'s"+" "+"Job Title is :"+jobTitle);
        System.out.println(fullName+"'s"+" "+"salary is: "+"$ "+salary);
        System.out.println(fullName+" is full time employee: "+isFullTime);
        System.out.println(fullName +" is married: "+isMarried);






    }












}

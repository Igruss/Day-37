package day42_Static;

import java.util.SplittableRandom;

/*
    create a class called Testers
                    Attributes:
                        name, employeeID, JobTitle, Salary
                    Actions:
                        setInfo(), smokeTesting(),  creatingTicket(), toString()

 */
public class Tester {

    String name;
    char gender;
    long employeeID;
    String jobTitile;
    double salary;

    public void setInfo (String name,char gender,long employeeID, String jobTitile,double salary){
        this.name = name;
        this.gender=gender;
        this.employeeID = employeeID;
        this.jobTitile = jobTitile;
        this.salary= salary;

    }
    public void smpkeTesting(){
        System.out.println(name+" smoke testing");
    }
    public void creatingTicket(){
        System.out.println(name+" is creating ticket");
    }
    public String toString(){
        return "Name: "+name+", Gender: "+gender+", Job Title: "+jobTitile+", EmployeeID: "+employeeID+", Salary: "+salary+"$";

    }


}

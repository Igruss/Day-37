package day48_Inheritance.Employee;

/*
 1. super class: Employee
                    variables: salary, name, id, jobTitle, gender
                    methods: setInfo, toString

 */
public class Employee {

    public String name;
    public int ID;
    public String jobTitle;
    public double salary;
    public char gender;

    public void setInfo(String name, int ID, String jobTitle, double salary, char gender){
        this.name = name;
        this.ID = ID;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;
    }

    public String toString(){
        return  "======================================"+
                "\nName: "+name+
                "\nID: "+ID+
                "\nJob Title: "+jobTitle+
                "\nSalary: "+salary+
                "\nGender: "+gender+
                "\n======================================";
    }




}

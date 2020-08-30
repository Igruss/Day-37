package day48_Inheritance.Employee;

import com.sun.jmx.snmp.SnmpUnknownAccContrModelException;

/*
 2.2 Developer:
                            variables:  salary, name, id, jobTitle, gender
                                add a constructor that can set the fields
                            methods: fixingBugs, setInfo, toString

 */
public class Developer extends Employee {

    public Developer(String name, int ID, String jobTitle, double salary, char gender){
        setInfo(name,ID,jobTitle,salary,gender);
    }

    public void fixingBugs(){
        System.out.println(name + " is fixing bugs");
    }


}

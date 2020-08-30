package day48_Inheritance.Employee;

/*
   2.1 Tester:
                            variables:  salary, name, id, jobTitle, gender
                                add a constructor that can set the fields
                            methods: fundingBugs, setInfo, toString

 */
public class Tester extends Employee {

    public Tester(String name, int ID, String jobTitle, double salary, char gender){
        setInfo(name,ID,jobTitle,salary,gender);
    }

    public void fundingBugs(){
        System.out.println(name+ " is funding bugs");
    }


}

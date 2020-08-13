package day40_CustomClassPractice;

import javax.print.DocFlavor;

/*

    Offer
        Attribute:
            salary, Location, hasPTO, isFullTime, WFH, jobTitle, benifit
        Actions:
            setOfferInfo
            getOfferInfo
        MUST use this keyword
instance: each object has its own copy
this: refers to object instances
    this.  we only use it to call instance if local variable has the same name with instance variables

 */
public class Offer {

    double salary;
    String state;
    boolean hasPTO;
    boolean isFullTime;
    boolean isWFH;
    String jobTitle;
    boolean hasBenefit;

    public void setOfferInfo(double salary,String state,boolean hasPTO,boolean isFullTime,
                             boolean isWFH,String jobTitle,boolean hasBenefit ){
        this.salary = salary;
        this.state = state;
        this.hasPTO = hasPTO;
        this.isFullTime = isFullTime;
        this.isWFH = isWFH;
        this.jobTitle = jobTitle;
        this.hasBenefit = hasBenefit;
    }
    public void getOfferInfo(){//display information
        System.out.println("============================");
        System.out.println("Salary : $"+salary);
        System.out.println("Job Title : "+jobTitle);
        System.out.println("Job Location: "+state);
        System.out.println("Does job offer benefits?"+hasBenefit);
        System.out.println("Job offers PTO: "+hasPTO);
        System.out.println("Is offer full-time? "+isFullTime);
        System.out.println("Does offer have WFH option?"+isWFH);
        System.out.println("============================");


    }

}

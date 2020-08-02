package day09_IfStatement;
/*
2. write a java program that accepts three numbers and return the minimum number
                (assume that none of them are equal)
 */
public class Minimum {

    public static void main(String[] args) {

        double a=1000;
        double b=300;
        double c= 590;

        boolean aIsMin= a<b && a<c;

        boolean bIsMin = aIsMin !=true && b < c;

        boolean cIsMin = aIsMin == false && bIsMin !=true;

        double min = 0 ;

        if (aIsMin){
            min=a;
        }
        if(bIsMin){
            min=b;
        }
        if(cIsMin){
            min=c;
        }
        System.out.println(min+" is minimum number");

    }


}

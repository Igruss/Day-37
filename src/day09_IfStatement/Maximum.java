package day09_IfStatement;
/*
1. write a java program that accepts three numbers and return the maximum number
                (assume that none of them are equal)

 */
public class Maximum {
    public static void main(String[] args) {
        double a= 500;
        double b =200;
        double c =300;

        boolean aIsMax= a>b && a>c;
        boolean bIsMax= aIsMax==false && b>c; // !aIsMax && !bIsMax;
        //b>a && b>c;
        boolean cIsMax= aIsMax==false && bIsMax == false;
        // c>a && c>a;
        double max= 0; // we want assign the maximum number to variable max

        if (aIsMax){
          //  System.out.println(a);
            max=a;
        }else{
            max=b;
        }
        if(cIsMax){
           // System.out.println(c);
            max=c;
        }
        System.out.println(max+" is maximum number");










    }




}

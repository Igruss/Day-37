package day09_IfStatement;

public class Vote {
    public static void main(String[] args) {
        double age = 17;
        boolean usCitizen = true ;

        if(age >= 18 && usCitizen){
            System.out.println("Eligible to vote");
        }else{
            System.out.println("Not eligible to vote");
        }


    }

}

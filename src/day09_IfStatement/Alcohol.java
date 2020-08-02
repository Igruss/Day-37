package day09_IfStatement;
/*
write a java program that can identify if a person is eligible to buy alcohol

 */
public class Alcohol {
    public static void main(String[] args) {

        boolean hasID = true;
        int age = 19;

        boolean eligible= hasID && age >=21;

        if(eligible == true){
            System.out.println("Eligible to buy alcohol");
        }
        if(eligible == false){
            System.out.println("Go buy milk");
        }







    }


}

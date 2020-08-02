package day09_IfStatement;

public class Alcohol_2 {
    public static void main(String[] args) {
        int age = 18;
        boolean hasID = true;

        if (age >= 21 && hasID){
            System.out.println("You can buy alcohol");
        }else{
            System.out.println("You cannot buy alcohol");
        }


    }


}

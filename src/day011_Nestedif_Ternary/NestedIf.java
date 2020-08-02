package day011_Nestedif_Ternary;

public class NestedIf {
    public static void main(String[] args) {

        int score = 104;
        String result ="";

        if (score >= 0 && score <= 100) {
            if (score >= 90) {
                result = "A";
            } else if (score >= 80) {
                result = "B";
            } else if (score >= 70) {
                result = "C";
            } else if (score >= 60) {
                result = "D";
            } else {
                result = "F";
            }
        }else{
                result="Invalid";
            }
            System.out.println(result);
        System.out.println("==============================");




        }





    }




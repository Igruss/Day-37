package day011_Nestedif_Ternary;

public class NestedIf_Practice1 {
    public static void main(String[] args) {

        double salary = 12000;
        int jobHistory = 17;

        if (salary >= 30000) {
            if (jobHistory >= 2) {
                System.out.println("You are qualified");
            }else{
                System.out.println("You must have been on job at 2 years");
            }


        }else{
            System.out.println("You must earn at least $30K");
        }






    }




}

package day011_Nestedif_Ternary;

public class Ternary {
    public static void main(String[] args) {

        int num = 100;

        String result ="";

        if (num % 2 == 0) {
            result = "Even";
        }else{
            result = "Odd";
        }
        System.out.println(result);
        System.out.println("--------------------------");

       String result2= (num % 2 == 0) ? "Even" : "Odd";

        System.out.println(result2);
        System.out.println("=========================");

        int num1=10;
        int num2=20;
        int max1=0;

        if (num1 > num2) {
            max1=num1;
        }else{
            max1=num2;
        }
        System.out.println(max1);

        int max2 =(num1 > num2) ? num1 : num2;

        System.out.println(max2);

        int age = 22;
        boolean eligible =(age >=21) ? true : false;

        System.out.println(eligible);

        // In ternary total number of ? and : MUST be EQUAL






    }


}

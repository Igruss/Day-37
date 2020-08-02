package day011_Nestedif_Ternary;

public class DaysInMonth2 {
    public static void main(String[] args) {
        int month = 12;
        boolean validNumber = month >=1 && month <=12;
        boolean days28 = month == 2;
        boolean days30 = month ==4 || month ==6 || month ==9 || month==11;

        String result = "";

        if (validNumber) {
            if(days28){
                result = "28 days";
            } else if (days30) {
                result = "30 Days";
            }else{
                result = "31 Days";
            }

        }else{
            result= "Invalid";

        }
        System.out.println(result);



    }




}

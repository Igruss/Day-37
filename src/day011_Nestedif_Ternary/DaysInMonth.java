package day011_Nestedif_Ternary;
/*
2. write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
         HINT:
                28 days: 2
                30 days: 4,6,9,11
                31 days: 1,3,5,7,8,10,12

 */
public class DaysInMonth {
    public static void main(String[] args) {
        int month = 74;
        String result = "";
        boolean days28 = month == 2;
        boolean days30 = month ==4 || month ==6 || month ==9 || month==11;
      //  boolean days31 = month == 1 || month==3 || month==5 || month==7 || month ==8 || month ==10 || month == 12;
        boolean invalid = month < 1 || month >=12; // better and easier

        if (days28) {
            result="28 days";
        } else if (days30) {
            result="30 days";
        } else if (invalid) {
            result="Invalid";
        }else{
            result="31 days";
        }

        System.out.println(result);
        System.out.println("======================");

        String result2= (days28) ? "28 days" : (days30) ? "30 days" : (invalid) ? "Invalid" : "31 days";
        System.out.println(result2);








    }


}

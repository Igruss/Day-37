package day06_ComparisonOperators;

public class RelationalOperators {
    public static void main(String[] args) {

        boolean r1=10>9;
        System.out.println(r1);

        boolean r2=100<76;
        System.out.println(r2);

        boolean r3=87>=84;
        System.out.println(r3);

        boolean r4= 400==654;      //equal
        System.out.println(r4);

        boolean r5= 234!=334;     //not equal
        System.out.println(r5);

        int num1=101;
         boolean even= num1%2==0;      // 100%2=0
         boolean odd= num1!=0;         // 101%2=0(remainder is 1 )
        System.out.println(odd);

        int x=1000;
        boolean divisible= x%3==0;
        System.out.println(divisible);

        boolean divisible1=x%5==0;
        System.out.println(divisible1);
















    }
}

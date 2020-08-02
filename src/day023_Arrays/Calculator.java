package day023_Arrays;

import day12_Switch_Scanner.Switch;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        while (true) {

            System.out.println("Enter two numbers");
            double num1 = input.nextInt();
            double num2 = input.nextInt();
            System.out.println("Enter the math operator");
            char o = input.next().charAt(0);

/*             double result = (o == '+')? num1 + num2 :(o == '-')? num1 - num2 :(o == '*')?
                    num1 * num2 :( o == '/')? num1 / num2 :( o == '%' )? num1 % num2 : 0;

            System.out.println(result);

*/

            switch(o){

                case '+':
                    System.out.println(num1 + num2);
                    break;
                case '-':
                    System.out.println(num1 - num2);
                    break;
                case '*' :
                    System.out.println(num1 * num2);
                    break;
                case '/' :
                    System.out.println(num1 / num2);
                    break;
                case '%' :
                    System.out.println(num1 % num2);
                    break;
                default:
                    System.out.println("Invalid operator");

            }
            System.out.println("Do you want to continue");
            String a = input.next();

            while( !( a.equals("yes") || a.equals("no"))){ // while the answer is invalid
                System.out.println("Invalid answer, please enter yes or no");
                System.out.println("Do you want to continue?");
                a = input.next().toLowerCase();
            }

            if(a.equalsIgnoreCase("no")){
                break;
            }


        }










    }

}

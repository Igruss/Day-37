package day20_WhileLoops;

public class WhileLoop_Practice2 {

    public static void main(String[] args) {

        int i= 0;
       // String res = "Igor";

        while(i <5){
            System.out.println("Cybertek");
            i ++;
        }
        System.out.println(i);

        System.out.println("=======================");

        String str ="Cybertek";
        String res = "";
        int index = str.length()-1;
        while(index >=0){
          res += str.charAt(index);
            index --;
        }
        System.out.println(res);




    }



}

package day08_LogicalOperators;

public class Logical {

    public static void main(String[] args) {

        //!: opposite boolean
        boolean r1=9>7; //true
        boolean r2=!r1; //false

        System.out.println(r1+" : "+r2);

        // &&:and boolean( If any of final result is false == false)

        boolean r5=9>5;
        boolean r6=9>10;
        boolean r7= r5 && r6;
        System.out.println(r7);

        // ||:or- either boolean (always true unless all off them are false)

        boolean r8= true == !false || false == true;
        System.out.println(r8);

        boolean r9 = !false== false || false == !false;
        System.out.println(r9);





    }



}

package day43_Static;

import day42_Static.Tester;

public class Static_Block2 {

    static int a ;
    static String b;
    static Tester tester1 ;
    static Tester tester2 ;


    static {
        a = 100;
        b = "Cybertek";

        tester1 = new Tester();
        tester1.setInfo("Muhtar",'M',122234,"SDET",100000);
        tester2 = new Tester();
        tester2.setInfo("Ramazan",'M',122235,"SDET",110000);

    }

    public static void main(String[] args) {

        System.out.println(a);
        System.out.println(b);


    }

}

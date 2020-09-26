package day57_Polymorphism.PhoneTask;

import java.util.Arrays;

public class PhoneObjects {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone","11","6",1100);
        Samsung samsung = new Samsung("Galaxy","S20","6.8",899);
        Huawei huawei = new Huawei("H1500","Robbery","5.3",187);

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(huawei);

        Phone phone1 = new Iphone("Iphone","12","5",1200);
        Phone phone2 = new Samsung("Galaxy","S8","7",940);
        Phone phone3 = new Huawei("Halla","andaw1","6",89);

        Phone [] phones ={iphone,phone1,samsung,phone2,huawei,phone3};

        System.out.println(Arrays.toString(phones));





    }


    }


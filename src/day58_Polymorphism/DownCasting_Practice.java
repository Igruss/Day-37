package day58_Polymorphism;


import day57_Polymorphism.PhoneTask.Huawei;
import day57_Polymorphism.PhoneTask.Iphone;
import day57_Polymorphism.PhoneTask.Phone;
import day57_Polymorphism.PhoneTask.Samsung;

public class DownCasting_Practice {

    public static void main(String[] args) {

        Phone phone1 = new Iphone("Iphone","11","6",1000);
        Iphone iphone = (Iphone)phone1;

        System.out.println(phone1);
        System.out.println(iphone);

        iphone.faceTiming(2032324411);

        ((Iphone) phone1).faceTiming(1111111111);
        System.out.println("==================================");

        Phone phone2 = new Samsung("Galaxy","S20","7",1000);

        ((Samsung)phone2).freezing();

       // ((Iphone) phone2).faceTiming(121333441);//  IS NOT RELATED (ClassCastException)
        System.out.println("====================================");

        Phone phone3 = new Huawei("Huawei","Spy","7",177);

        ((Huawei)phone3).stealInfo();







    }
}

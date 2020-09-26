package day58_Polymorphism;

import day57_Polymorphism.PhoneTask.*;

import java.util.ArrayList;
import java.util.Arrays;

/*
 Create a class called PhoneShop
    Copy the following array of Phone:
            Phone[] phone = {
                            new Iphone("12", "6.1", 1000),
                            new Samsung("S20", "7", 1100),
                            new Iphone("12", "6.1", 1000),
                            new Samsung("S20", "7", 1100),
                            new Iphone("12", "6.1", 1000),
                            new Samsung("S20", "7", 1100),
                            new Iphone("12", "6.1", 1000),
                            new Samsung("S20", "7", 1100),
                            new Iphone("12", "6.1", 1000),
                            new Samsung("S20", "7", 1100),
                            new Iphone("12", "6.1", 1000),
                            new Samsung("S20", "7", 1100),
                            new Samsung("S20", "7", 1100),
                            new Samsung("S20", "7", 1100),
                            new Samsung("S20", "7", 1100)
                            };
            (Phone is imported from day57 package)
        create an arrayList called phoneShop and store all phone objects from array of phone
        write a program that can count the total number of Iphone, Samsung and Huawei from the list

 */
public class PhoneShop {

    public static void main(String[] args) {

        Phone [] phone ={
                new Iphone("IPhone", "10", "4.1",1000),
                new Samsung("Galaxy", "S7", "5",1100),
                new Iphone("IPhone", "8", "5",1100),
                new Samsung("Galaxy", "S7", "5",1100),
                new Iphone("IPhone", "11","6",1100),
                new Samsung("Galaxy", "S7", "5.5",1100),
                new Iphone("IPhone", "X","5",1100),
                new Samsung("Galaxy", "S8", "5",1100),
                new Iphone("IPhone", "8","4.6",1100),
                new Samsung("Galaxy", "S8","5",1100),
                new Iphone("IPhone", "11", "5",1100),
                new Samsung("Galaxy", "S20","4.8",1100) ,
                new Samsung("Galaxy", "S20","4",1100),
                new Samsung("Galaxy", "S20", "6",1100),
                new Samsung("Galaxy", "S20","7",1100) ,
        };

        ArrayList<Phone> phoneShop = new ArrayList<>(Arrays.asList(phone));

        int countIphone =0;
        int countSamsung = 0;
        int countHuaWei =0;

   /*     for(int i = 0; i <= phoneShop.size()-1; i++){
            if( phoneShop.get(i) instanceof Iphone  ){
                countIphone++;
            }else if(phoneShop.get(i) instanceof Samsung){
                countSamSung++;
            }else{
                countHuaWei++;
            }

        }
*/


        for (Phone each : phoneShop){
            if(each instanceof Iphone)
                countIphone++;
            else if(each instanceof Samsung)
                countSamsung++;
            else
                countHuaWei++;
        }


        System.out.println("Iphone: "+countIphone);
        System.out.println("Iphone: "+countSamsung);
        System.out.println("Iphone: "+countHuaWei);

    }

}

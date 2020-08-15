package day41_toString;

import java.util.ArrayList;

/*

            create a class called carpetObjects, and create an array of the carpet that contains 5 carpet objects ( make sure you set the instance variables of those objets)
            create two ArrayList of carpets:
                                        persianCarpets
                                        reugularCarpets
            write a program to store all the persian Carpets into the list of persianCarpets, and store all regular carpets into the list of reugularCarpets
                    use for each loop to print out all the persian carpets
 */
public class CarpetObjects {

    public static void main(String[] args) {

      Carpet carpets [] = {new Carpet(), new Carpet(),new Carpet(),new Carpet(),new Carpet()};

        carpets[0].customOrder(4.5,3.5,17.5,false);
        carpets[1].customOrder(5.5,3.5,19.5,true);
        carpets[2].customOrder(4.5,5.5,15.5,false);
        carpets[3].customOrder(3.5,3.5,18.5,true);
        carpets[4].customOrder(6.5,5.5,20.5,true);
     /*
      for(Carpet each : carpets){
          each.getCarpetInfo();

      */

        ArrayList<Carpet> persianCarpet = new ArrayList<>();
        ArrayList<Carpet> regularCarpet = new ArrayList<>();
/*
        for(int i =0;i <= carpets.length-1;i++){
            if(carpets[i].isPersian){
                persianCarpet.add(carpets[i]);
            }else{
                regularCarpet.add(carpets[i]);
            }
*/
        for(Carpet each : carpets){
            if(each.isPersian){
                persianCarpet.add(each);
            }else{
                regularCarpet.add(each);
            }


      }
        System.out.println("Number of persian carpets: "+persianCarpet.size());
        System.out.println("Number of regular carpets: "+regularCarpet.size());


    }

}

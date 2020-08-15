package day41_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObjects2 {

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
        persianCarpet.addAll(Arrays.asList(carpets));
        persianCarpet.removeIf(p ->!p.isPersian);

        ArrayList<Carpet> regularCarpet = new ArrayList<>();
        regularCarpet.addAll(Arrays.asList(carpets));
     //   regularCarpet.removeIf(p -> p.isPersian);
        regularCarpet.removeAll(persianCarpet);


        System.out.println("Number of persian Carpets: "+persianCarpet.size());
        System.out.println("Number of regular Carpets: "+regularCarpet.size());


    }


}

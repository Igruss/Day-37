package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class Methods {

    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("BMW","Mercedes","Infinity","Tesla","Toyota"));

       // cars.remove(3);
       //cars.removeIf(p -> p.toLowerCase().contains("m"));
        cars.retainAll(Arrays.asList("Tesla"));

        System.out.println(cars);

        System.out.println("+==================================");

        ArrayList<String > groceryList = new ArrayList<>();
        groceryList.addAll(Arrays.asList("Eggs","Milk","Paper Towels","Toilet Paper",
                "Mango","Orange","Avocado"));
        boolean r1 = groceryList.contains("Pepsi");

        System.out.println(groceryList);
        System.out.println(r1);

         boolean r2 =groceryList.containsAll(Arrays.asList("Eggs","Orange","Milk"));
        System.out.println(r2);


        System.out.println("Total Number of Items: "+ groceryList.size());

        // set the dragon fruit to apple:
        groceryList.set(groceryList.size()-1 ,  "Apple" );
        groceryList.set( groceryList.indexOf("Paper Towels") ,  "Dish Washer");

        System.out.println(groceryList);

        groceryList.clear();
        System.out.println(groceryList);


    }
}

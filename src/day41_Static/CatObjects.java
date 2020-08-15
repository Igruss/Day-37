package day41_Static;

import java.util.ArrayList;
import java.util.Arrays;

/*
  CatObjects:
            create 5 objects of Cat and store them into an array variable
            print out the informations of every single cat
                    (DO NOT use getInfo method)
            ArrayList:
                maleCats
                femaleCats
                first approach: apply loop ( both for each loop and for loop)
                second approach: do not use loop

 */
public class CatObjects {

    public static void main(String[] args) {
        Cat[] cats = {new Cat(), new Cat(), new Cat(), new Cat(), new Cat()};

        cats[0].setCatInfo("Macak", 2, 'M', "White", "Stray");
        cats[1].setCatInfo("Maca", 2, 'F', "Black", "Persian");
        cats[2].setCatInfo("Cakani", 5, 'M', "Gray", "Syam");
        cats[3].setCatInfo("Leo", 3, 'M', "Yellow", "Bengal");
        cats[4].setCatInfo("Mia", 1, 'F', "Mix", "Scottish");

        for (Cat each : cats) {
            System.out.println(each);
        }

        ArrayList<Cat> maleCats = new ArrayList<>();
        maleCats.addAll(Arrays.asList(cats));
        maleCats.removeIf(p -> p.gender != 'M');

        ArrayList<Cat> femaleCats = new ArrayList<>();
        femaleCats.addAll(Arrays.asList(cats));
        femaleCats.removeIf(p -> p.gender != 'F');

        System.out.println("Number of male cats: "+maleCats.size() );
        System.out.println("Number of female cats: "+femaleCats.size() );

    }




}

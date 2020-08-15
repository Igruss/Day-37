package day41_toString;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObjects2 {
    public static void main(String[] args) {

        Cat[] cats = {new Cat(), new Cat(), new Cat(), new Cat(), new Cat()};

        cats[0].setCatInfo("Macak", 2, 'M', "White", "Stray");
        cats[1].setCatInfo("Maca", 2, 'F', "Black", "Persian");
        cats[2].setCatInfo("Cakani", 5, 'M', "Gray", "Syam");
        cats[3].setCatInfo("Leo", 3, 'M', "Yellow", "Bengal");
        cats[4].setCatInfo("Mia", 1, 'F', "Mix", "Scottish");

        ArrayList<Cat> femaleCats = new ArrayList<>();
        femaleCats.addAll(Arrays.asList(cats));
        femaleCats.removeIf(p -> p.gender == 'M');

        ArrayList<Cat> maleCats = new ArrayList<>();
        maleCats.addAll(Arrays.asList(cats));
        maleCats.removeIf(p -> p.gender == 'F');

        System.out.println("Number of male cats: "+maleCats.size() );
        System.out.println("Number of female cats: "+femaleCats.size() );


    }

}

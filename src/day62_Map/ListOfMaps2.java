package day62_Map;

import java.time.LocalDate;
import java.util.*;

public class ListOfMaps2 {

    public static void main(String[] args) {


        String[] friends = {"Peki", "Nidza", "Maki", "Sale", "Peca"};
        LocalDate[] DOBFriends = {LocalDate.of(1981, 1, 19),
                LocalDate.of(1979, 11, 10),
                LocalDate.of(1983, 1, 3),
                LocalDate.of(1981, 7, 7),
                LocalDate.of(1983, 3, 17)};

        String[] classMates = {"Alonce", "Raja", "Hamit", "Banu", "Amir"};
        LocalDate[] DOBClassMates = {LocalDate.of(1998, 4, 11),
                LocalDate.of(1989, 6, 11),
                LocalDate.of(1995, 3, 10),
                LocalDate.of(1998, 4, 20),
                LocalDate.of(1999, 5, 07)};

        String[] family = {"Cale", "Keva", "Naka", "Iva", "Ani"};
        LocalDate[] DOBFamily = {LocalDate.of(1947, 8, 31),
                LocalDate.of(1964, 4, 10),
                LocalDate.of(1983, 5, 8),
                LocalDate.of(1998, 2, 4),
                LocalDate.of(1999, 4, 22)};


        List<Map<String, LocalDate>> list = new ArrayList<>();
        list.addAll(Arrays.asList(
                new LinkedHashMap<>(),
                new LinkedHashMap<>(),
                new LinkedHashMap<>()
        ) );


        for(int i = 0; i < friends.length; i++){
            list.get(0).put(friends[i], DOBFriends[i]);
        }

        for(int i = 0; i <classMates.length; i++){
            list.get(1).put(classMates[i], DOBClassMates[i]);
        }

        for(int i=0; i < family.length; i++){
            list.get(2).put(family[i], DOBFamily[i]);
        }

        System.out.println(list);




    }

}






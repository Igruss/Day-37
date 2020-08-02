package day35_ArrayList;

import java.util.ArrayList;

/*
 3. write a program that can combine two String arrays into one arrayList
            ex:
                arr1 = {"A", "B", "C"};
                arr2 = {"D", "E", "F", "G"};
                list ==> {"A", "B", "C", "D", "E", "F", "G"}
 */
public class Combine2Arrays_List {

    public static void main(String[] args) {

        String [] arr1 ={"Aalia","Mohammad","Aslan","Ernis"};
        String [] arr2 = {"Zarina","Mee","Irina","Virginia","Ali","Dawud"};

        ArrayList<String> studentsList = new ArrayList<>();

        for(String each : arr1){
            studentsList.add(each);
        }

        for(String each : arr2){
            studentsList.add(each);
        }
        System.out.print(studentsList+" ");

    }
}

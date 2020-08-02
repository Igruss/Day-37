package day023_Arrays;

public class Array_Practice1 {


    public static void main(String[] args) {

        String [] students = {"Muhtar", "Ninja ", "Asiya"," Nadir"};

        String  name1 =  students[3];

        System.out.println(name1);

        System.out.println("================================");

        int [] scores = {85,70,95,90,100};
        String [] names = {"Mike","Adam","Tony","Johny","Amy"};

/*
        System.out.println(names[0] + " : "+ scores[0]);
        System.out.println(names[1] + " : "+ scores[1]);
        System.out.println(names[2] + " : "+ scores[2]);
        System.out.println(names[3] + " : "+ scores[3]);
        System.out.println(names[4] + " : "+ scores[4]);
*/

        for(int i =0; i <=4; i++){
            System.out.println(names[i]+ " : "+ scores[i]);
        }
        System.out.println("=============================");

        String [] classMates = new String [5];
        classMates [0]= "Fatih";
        classMates [1]= "Hazel";
        classMates [2]= "Viorel";
        classMates [3]= "Elkem";
        classMates [4]= "Ahmed";

        for(int i =0 ; i <=classMates.length -1 ; i++){
            System.out.println(classMates[i]);
        }



    }
}

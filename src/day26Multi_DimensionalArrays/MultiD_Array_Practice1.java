package day26Multi_DimensionalArrays;

import java.util.Arrays;

public class MultiD_Array_Practice1 {

    public static void main(String[] args) {
         String [] testers = {"Lillia","Odina","Cristina","Elkem"};
         String [] developers = {"Ahmet","Erfan","Rosa","Sarah"};
         String [] SM = {"Nummamet"};
         String [] PO ={"Nadir"};
         String [] BA ={"Alex"};

         String[] testers2 = {"Irene","Aslan","Nazar"};

         String [][] scrumTeam = {testers,developers,SM,PO,BA};

         scrumTeam [4][0] = "Adam";
         scrumTeam [1] [2] = "Emine";
         scrumTeam [0] = testers2;

        System.out.println(Arrays.deepToString(scrumTeam));
        System.out.println("==================================");

        for(String [] each : scrumTeam){
            for(String name : each){
                System.out.println(name);
            }
           // System.out.println(Arrays.toString(each));
        }

        System.out.println("==================================");

        int [][] scores = {{10,20,30,45,13},{60,55,75,105},{93,48,125,135}};

        for(int [] each1DArray : scores){
            for(int eachElement : each1DArray){
                if(eachElement %3 ==0 || eachElement %5 == 0)
                System.out.print(eachElement+" ");
            }
        }



    }
}

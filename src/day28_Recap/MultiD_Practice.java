package day28_Recap;

import java.util.Arrays;

public class MultiD_Practice {

    public static void main(String[] args) {

        String[] group33 = {"Davut","Dilara","Nurmamet","Nurbiye","Pavlo","Julaiti","Virginia","Zain","Ali","Etnick","Aigul","Mike","Veola"};
        String[] group22 = {"Aiperi","Aalia","Rumiya","Viorel", "Samir"};
        String[] group2 = { "Ali", "Anton", "Elif", "Filip", "Guljannat" };
        String [] group21 = {"Violeta","Alla", "Adam", "Lilia"};
        String [] group17 =  {"Elvira", "Zeliha", "Paban","Asylkan", "Dilyar", "Roza","Kamil", "Sedge"};

        String [][] Batch20 ={group33,group22,group2,group21,group17};

        for(int i =0; i <=Batch20.length -1;i++){
            String [] eachGroup = Batch20 [i];
           // System.out.println(Arrays.toString(eachGroup));
            for(int j = 0; j <=eachGroup.length-1;j++){
                String eachStundent=eachGroup[j];
                if(eachStundent.toLowerCase().contains("m")){
                    System.out.print(eachStundent+" ");
                }

            }
            System.out.println();
        }



    }
}

package Office_Hours.Practice_07_15_2020;

public class Words {

    public static void main(String[] args) {

        String str = "dog dog dog   cat cat cat dog";
        int dogCount = 0;
        int catCount = 0;

        while(str.contains("cat")){

            str = str.replaceFirst("cat","");
              catCount ++;
        }
        System.out.println(catCount);


    }
}

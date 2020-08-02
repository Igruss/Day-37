package day29_CustomMethods;
//    10. write a method that can remeove the duplicates from the string
public class RemoveDuplicates {

    public static void main(String[] args) {

        String str ="aaaababababbeeeedddcdceesddds";
        removeDup(str);

    }
      public  static void removeDup(String str){
        String nonDup = "";

        for(String each : str.split("")){
            if(!nonDup.contains((each))){
                nonDup +=each;
            }
        }
          System.out.println(nonDup);



      }


}

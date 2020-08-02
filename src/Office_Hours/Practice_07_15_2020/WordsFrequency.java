package Office_Hours.Practice_07_15_2020;

public class WordsFrequency {

    public static void main(String[] args) {
        String str = "JavajavaJavajavaJAVA".toLowerCase();
         // str = str.toLowerCase();
        int count =0;
        while(str.contains("java")){
           count ++;
           str = str.replaceFirst("java","");
        }
        System.out.println(count);






    }
}

package day17_StringReview;

public class Pool_VS_Heap {
    public static void main(String[] args) {

        String s1 = "Cybertek";
        String s2 = new String("Cybertek");
        String s3 = "cybertek";

        System.out.println(s1==s2);//new case cannot be same
        System.out.println(s2==s3);// java is case sensitive






    }


}

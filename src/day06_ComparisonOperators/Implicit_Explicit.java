package day06_ComparisonOperators;

public class Implicit_Explicit {

    public static void main(String[] args) {
        short s1=100;
        long  l1=s1; //implicit casting:automatically done(casting smaller primitive to larger)

        long l2= (long)s1; //manual implicit casting

        int I1=300;
        double D1=I1;

        System.out.println(D1);
        System.out.println("==========================");

        double d1=400.5555;  //explicit casting:Manually ONLY (casting larger primitive to smaller)
        int i1 =(int)d1;
        System.out.println(i1);

        long L1=4400;
        short sh1=(short)L1;
        System.out.println(sh1);

        double m1=34.5;
        float f1=(float)m1;
        System.out.println(f1);








    }
}

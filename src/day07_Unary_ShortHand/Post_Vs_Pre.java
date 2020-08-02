package day07_Unary_ShortHand;

public class Post_Vs_Pre {
    public static void main(String[] args) {

        int a=10;
        System.out.println(++a);// increase it imediatally
        System.out.println(a);
        System.out.println("================");

        int b =10;
        System.out.println(b++);// increase it eventually
        System.out.println(b);
        System.out.println("====================");

        int c=25;
        int d=c++;// d=25 ----> c=26
        System.out.println(c);
        System.out.println(d);
        System.out.println("====================");

        int A=1;
        A=-A-- + A++ / -A-- * --A;
      // A = -1  + 0 /  -1  * -1 = -1 + 0 = -1
        System.out.println(A);
        System.out.println("=================");

        int r=50;
        r = --r + r++ + r-- + r++;
        // r= 49 + 49 + 50 +49
        System.out.println(r);

        int x=4;
        int y=x*4 - x++;
        // y= 4*4 - 4 = 12
        System.out.println(y);





    }





}

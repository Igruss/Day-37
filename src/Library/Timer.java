package Library;

import java.util.*;

public class Timer {

    public static void main(String[] args) throws Exception {


        Scanner scan = new Scanner(System.in);
        System.out.println("Num of min:");
        int min = scan.nextInt();
        for (int i = min; i > 0; --i) {
            if (i == 0)
                break;
            for (int z = 59; z >= 0; --z) {
                System.out.println((i - 1) + " minutes and " + z + " seconds left");
                Thread.sleep(1000);
            }
        }
        System.out.println("Time is up");


    }

}
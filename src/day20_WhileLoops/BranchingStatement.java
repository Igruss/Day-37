package day20_WhileLoops;

public class BranchingStatement {

    public static void main(String[] args) {

        char ch ='A';
        while(ch <='E'){
            if(ch == 'C'){
                ch ++;
                continue; // skips everything even thr iterator
            }
            System.out.println(ch);
            ch ++;

        }

        boolean a = true;

        while(a){
            System.out.println("Test Started");
            //break;
            System.exit(0); // Stops the entire program
        }
        System.out.println("Completed");



    }
}

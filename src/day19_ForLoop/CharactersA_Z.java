package day19_ForLoop;
/*
     5. Write a program that will print out all letters in English alphabet in ascending order
    6. Write a program that will print out all letters in English alphabet in descedning order

 */
public class CharactersA_Z {
    public static void main(String[] args) {

        for(char ch ='A'; ch <= 'Z';ch ++ ){
            System.out.print(ch + " ");
        }
        System.out.println();
        System.out.println("============================");

        for(char ch ='Z'; ch >='A';ch --){
            System.out.print(ch + " ");
        }



    }



}

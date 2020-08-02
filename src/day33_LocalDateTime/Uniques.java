package day33_LocalDateTime;
/*
    1. create a method that can print out the unique numbers from an array of integer
        2. create a method that can print out the unique numbers from an array of double
        3. create a method that can print out the unique words from an array of String
        4. creata a method that can print out the unique characters from an array of chars
 */
public class Uniques {

    public static void main(String[] args) {

        int [] arr = {2,2,1,3,3};

        for(int element : arr){
            int count = 0;
            for(int b : arr){
                if(element == b){
                    count ++;
                }
            }
            if(count ==1){
                System.out.println(element + " ");
            }
        }
        System.out.println();
        System.out.println("==========================================");

        int [] n1 ={12,23,22,40,70,540,100,20,30,100,60,100,};

        uniqueElements(n1);
        System.out.println("====================================");

        double [] n2 ={10,20,20,30,55,45,5,55,545,45};
        uniqueElements(n2);

        System.out.println("-======================================");

        String [] n3 ={"A","A","b","B","c","c","D","D"};
        uniqueElements(n3);

        System.out.println("=======================================");

        char [] ch = {'C','C','A','B','D','d'};
        uniqueElements(ch);


    }

    public static void uniqueElements (int [] arr){
        for(int element : arr){
            int count = 0;
            for(int b : arr){
                if(element == b){
                    count ++;
                }
            }
            if(count ==1){
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }

    public static void uniqueElements (char [] arr){
        for(char element : arr){
            int count = 0;
            for(char b : arr){
                if(element == b){
                    count ++;
                }
            }
            if(count ==1){
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }

    public static void uniqueElements (double [] arr){
        for(double element : arr){
            int count = 0;
            for(double b : arr){
                if(element == b){
                    count ++;
                }
            }
            if(count ==1){
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }

    public static void uniqueElements (String [] arr){
        for(String element : arr){
            int count = 0;
            for(String b : arr){
                if(element.equals(b)){
                    count ++;
                }
            }
            if(count ==1){
                System.out.print(element + " ");
            }
        }
        System.out.println();
    }






}

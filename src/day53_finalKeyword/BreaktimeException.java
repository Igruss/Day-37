package day53_finalKeyword;

public class BreaktimeException extends RuntimeException{

    public BreaktimeException(){
        super("It's time for a break");
        System.err.println("Time to take 15 minutes break");
    }
    public BreaktimeException(String str){
        super(str);
        System.err.println("Time to take 15 minutes break");
    }

}

class Test{

    public static void main(String[] args) {

         throw new BreaktimeException("You need to give us a break");
      //  throw  new RuntimeException("This is Runtime exception");





    }
}
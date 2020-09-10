package day53_finalKeyword;

public class InvalidBrowserNameException extends RuntimeException{

    public InvalidBrowserNameException(){
        super("Invalid Browser Name");
    }

    public InvalidBrowserNameException(String str){
        super(str);
        System.err.println("Are you kidding");
    }


}

class Test2{


    public static void main(String[] args) {

        String name = "Opera";

        switch (name.toLowerCase()){
            case "chrome":
                System.out.println("Chrome is selected");
            break;
            case "firefox":
                System.out.println("Firefox is selscted");
                break;
            case"safari":
                System.out.println("Safari is selscted");
                break;

            default:
                throw new InvalidBrowserNameException("Please enter valid browser name");
        }
     //   throw new InvalidBrowserNameException();




    }

}
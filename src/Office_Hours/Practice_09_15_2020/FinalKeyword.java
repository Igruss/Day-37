package Office_Hours.Practice_09_15_2020;

public class FinalKeyword {

    private final int c = 200;

    public int getC(){
        return c;
    }
/*
    public void setC(int c){  cannot modify final method
        this.c = c;
    }
*/

    final private String userName = "cybertek";
    final private String passWord = "Cybertek123";

    public String getUserName() {
        return userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public static void main(String[] args) {

        final int a = 100;
        // a = 200;


    }

class TestBase{
        public final void setUp(){
            System.out.println("Set up the driver");
            System.out.println("Open Browser");
            System.out.println("URL");
            System.out.println("Maximize window");
            System.out.println("Implicit wait");

        }
        public final void tearDown(){
            System.out.println("if failed,take screenshot");
            System.out.println("Close Browser");
        }

}

class TestCase extends TestBase{

        // final method cannot be overridden

    }


final class Tester{



}

// class BA extends Tester{ final class cannot be super class ,only sub



}


}




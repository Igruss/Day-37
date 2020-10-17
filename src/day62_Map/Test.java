package day62_Map;

public class Test {

    public static void main(String[] args) {

        //String favoriteColor = "Purple";

        Color favoriteColor = Color.Blue; // only enum colors

        System.out.println(favoriteColor);

       // String browserName = "any browser";

        Browser browserName = Browser.chrome;

        switch (browserName){

            case chrome:
                System.out.println("Chrome browser is set");
                break;
            case firefox:
                System.out.println("Firefox browser is set");
                break;
            case safari:
                System.out.println("Safari browser is set");
                break;
            case edge:
                System.out.println("Edge browser is set");
                break;
        }

        System.out.println("============================================");

        Day day = Day.Friday ;

        Month month = Month.November;

        Level level = Level.Ultra;

        Planet planet = Planet.Pluto;

    }

}

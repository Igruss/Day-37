package Office_Hours.Practice_09_09_2020;

public class PhoneShop {

    public static void main(String[] args) {

     Iphone iphone = new Iphone("11 Pro",1000);

     iphone.call(911);
     iphone.text(347459891);

        System.out.println(iphone);

        System.out.println("====================================");

     Samsung samsung = new Samsung("Galaxy Note20",799.99) ;

        System.out.println(samsung);
        samsung.call(41245);
        samsung.text(2216256);

        System.out.println("======================================");

        Nokia nokia = new Nokia("Brick",23);

        System.out.println(nokia);
        nokia.call(36615);
        nokia.text(325486);





    }

}

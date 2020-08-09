package day39_CustomClass;

public class CarMax {

    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();

        car1.setInfo("Lexus","RX350",2019,"Gray",
                11987,56786);
        car2.setInfo("Lexus","RX550",2018,"Gray",
                117987,36786);
        car3.setInfo("Bugatt","Veyron",2019,"Silver",
                1987,556786);
        car4.setInfo("Toyota","Prius",2016,"Blue",
                51987,16786);
        car5.setInfo("Kia","Forte",2017,"Black",
                4500,14786);

        car1.getInfo();
        car2.getInfo();
        car3.getInfo();
        car4.getInfo();
        car5.getInfo();

        car3.start();


    }
}

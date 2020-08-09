package day39_CustomClass;

public class Car {
    /*
    Attributes:
    model,brand,year,color,mileage,price
     */

    String brand;
    String model;
    int year;
    String colour;
    double mileage;
    double price;

    public void setInfo(String carBrand, String carModel, int carYear
            , String carColour, double carMileage, double carPrice) {
        brand = carBrand;
        model = carModel;
        year = carYear;
        colour = carColour;
        mileage = carMileage;
        price = carPrice;


        }

    public void getInfo(){
        System.out.println(year + " " + brand + " " + model + ", " + colour +
                ", " + mileage + ", $" + price);

    }
}



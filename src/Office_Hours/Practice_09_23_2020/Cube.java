package Office_Hours.Practice_09_23_2020;


import day43_Static.Variables;

public class Cube extends Shape implements Volume {
    //area, perimeter, volume
    public double side;

    public Cube(double side){
        if(side <= 0 ){
            throw new RuntimeException("Cube side can't be negative or 0");
        }
        this.side = side;
        area = calculateArea();
        perimeter = calculatePerimeter();
        double volume = calculateVolume();
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2) * 6; // side * side * 6
    }

    @Override
    public double calculatePerimeter() {
        return side * 12;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(side,3); // side * side * side
    }

    @Override
    public String toString() {
        return "Cube{" +
                "side=" + side +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=";
    }

}
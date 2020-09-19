package day55_Abstraction.ShapeTask;

public class Square extends Shape{

    double side;

    public Square(double side) {
        if(side<=0){
            throw new RuntimeException("Sides of a Square cannot be negative or zero");
        }
        this.side=side;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
        name = "Square";
        hasVolume = false;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 4*side;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nside";
    }

}

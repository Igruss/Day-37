package day50_Inheritance_Overriding.ShapeTask;

public class Square extends Shape{

    public double side;
    public Square(double side){
        this.side=side;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }
    @Override
    public double calculateArea() {
        return side*side;
    }
    @Override
    public double calculatePerimeter() {
        return side*4;
    }

}

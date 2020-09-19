package day55_Abstraction.ShapeTask;

public class Triangle extends Shape {
    double base;
    double height;

    public Triangle(double base , double height){
        if(base<=0 || height<+0){
            throw new RuntimeException("Base or height of a Triangle can not be negative or zero");
        }
        this.base = base;
        this.height = height;
        area = calculateArea();
        perimeter =calculatePerimeter();
        volume = calculateVolume();
        name = "Triangle";
        hasVolume = false;
    }
    @Override
    public double calculateArea() {
        return (base*height)/2;

    }

    @Override
    public double calculatePerimeter() {
        return Math.sqrt((base+height));
    }

    @Override
    public double calculateVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nbase=" + base +
                "\nheight=" + height;
    }


}

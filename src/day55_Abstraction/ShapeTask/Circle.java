package day55_Abstraction.ShapeTask;
/*
create a sbub class of shape called Circle (meant to be subclass ONLY)
            attributes: radius, name(static), area, perimeter, hasVolume(static), volume
            override the abstract methods
            (if the shape does not have volume, return 0 for the colume)
            add a constructor that takes an argument for radius of the circle and initialize the instance variables: radius, area, perimeter, volume
            add a static block that can initialize the static variables of the circle

 */
public  final class Circle extends Shape{

    public double radius;

    public Circle(double radius){

        if(radius <=0){
            throw new RuntimeException("Radius of the circle cannot be negative or 0");
        }

        this.radius = radius;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
    }

    @Override
    public double calculateArea() {
        return Math.pow(radius,2) * Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return radius * 2 *Math.PI;
    }

    @Override
    public double calculateVolume() {
        return 0;
    }

static {
        name ="Circle";
        hasVolume = false;
}

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}

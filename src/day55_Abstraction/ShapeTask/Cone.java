package day55_Abstraction.ShapeTask;

import java.text.DecimalFormat;

public class Cone extends Shape {

    double radius;
    double height;
    double slantHeight;

    public Cone(double radius, double height){
        if(radius<= 0 || height<=0){
            throw new RuntimeException("Radius and height cannot be negative or zero");
        }
        name="Cone";
        this.radius = radius;
        this.height = height;
        slantHeight = Math.sqrt((Math.pow(height, 2)+Math.pow(radius, 2)));
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
    }

    @Override
    public double calculateArea() {
        return Math.PI*radius*(radius+slantHeight);
    }

    @Override
    public double calculatePerimeter() {
        return Math.PI*radius*slantHeight;
    }

    @Override
    public double calculateVolume() {
        return (Math.PI*Math.pow(radius, 2)*height)/3;
    }

    @Override
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return super.toString()+
                "\nradius=" + radius +
                "\nheight=" + height +
                "\nslantHeight=" + df.format(slantHeight);

    }

}

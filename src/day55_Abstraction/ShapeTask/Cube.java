package day55_Abstraction.ShapeTask;

public class Cube extends Shape {
    double side;

    public Cube(double side){
        if(side<=0){
            throw new RuntimeException("Sides of a Cube cannot be negative or zero");
        }
        this.side=side;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
        name = "Cube";
        hasVolume = true;
    }

    public double calculateArea(){
        return 6*(Math.pow(side, 2));
    }

    public double calculatePerimeter(){
        return 12*side;
    }

    public double calculateVolume(){
        return Math.pow(side, 3);
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nside: "+side;
    }

}

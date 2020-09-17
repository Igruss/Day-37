package day55_Abstraction.ShapeTask;
/*
create a class called shape objects:
            create objects of each shapes and calculate thier area, perimeter, and volume
    HINT: Math.PI will give you the actual value of PI

 */
public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle1 = new Circle(2.5);

        System.out.println(circle1);
        System.out.println("Circle has volume: "+ Circle.hasVolume);

        System.out.println("===================================");

        Rectangle rec1 = new Rectangle(4,6.5);

        System.out.println(rec1);
        System.out.println("Rectangle has volume: "+ Rectangle.hasVolume);
        System.out.println(new Rectangle(6,14));
        System.out.println("===================================");

        Cylinder cylinder1 = new Cylinder(4.5,8.8);

        System.out.println(cylinder1);
        System.out.println("Cylinder has volume: "+ Cylinder.hasVolume);
        System.out.println(new Cylinder(6.7,11));



    }

}

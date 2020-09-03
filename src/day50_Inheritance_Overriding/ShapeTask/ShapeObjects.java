package day50_Inheritance_Overriding.ShapeTask;

public class ShapeObjects {

    public static void main(String[] args) {

        Circle circle = new Circle(3);

        System.out.println(circle.area);

        Rectangle rectangle = new Rectangle(2.4,5.6);

        System.out.println(rectangle.area);

        System.out.println(circle.perimeter);

        System.out.println(rectangle.perimeter);



    }


}

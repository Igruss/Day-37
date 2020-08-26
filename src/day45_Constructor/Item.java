package day45_Constructor;

/*
       create a class called Item
                instance variables:
                    name, unitPrice, quantity
                add a constructor that can initialize the fields
=

 */
public class Item {


    String name;
    double unitPrice;
    int quantity;

    public Item(String name, double unitPrice, int quantity) {

        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;

    }

    public double calclCost() {
        return unitPrice * quantity;
    }

    public String toString() {
        return "Name: " + name + ", Unit Price: " + unitPrice + ", Quantity: " + quantity + ", Total Price: $" + calclCost();
    }

}

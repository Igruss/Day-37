package Office_Hours.Extra;
/*
		Create a class called Chef
            Attributes:
                name (String), employeeID (int), hourlyRate (double), fullTime (boolean)
            Actions: (all void methods)
                setInfo(): sets all of the instance variables with some values taken from the parameters.
                makeOrder(): chef's name + "is making an order"
                washDishes(): chef's name + "is washing the dishes"
                toString(): Returns (String) all the information of a Chef
                    -> Extra: For fullTime status, instead of printing a boolean value, print "full-time" or "part-time"
	*/

public class Chef  {

    String name;
    int employeeID;
    double hourlyRate;
    boolean fullTime;

    public void setInto(String name, int employeeID, double hourlyRate, boolean fullTime) {
        this.name = name;
        this.employeeID = employeeID;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
    }

    public void makeOrder() {
        System.out.println(name + " is making an order");
    }

    public void washDishes() {
        System.out.println(name + " is washing the dishes");
    }

    public String toString() {
        String s = "Name: " + name + ", Employee ID: " + employeeID + ", Hourly Rate: " + hourlyRate + ", Employment Status: ";
        s += fullTime ? "Full-Time" : "Part-Time";
        return s;
    }

}
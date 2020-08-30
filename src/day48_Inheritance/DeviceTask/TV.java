package day48_Inheritance.DeviceTask;

/*
create a sub class of Device called TV:
                    attributes: brand, model, price, MadeIn, hasBattery, hasMemory, screenSize, RemoteControl
                    methods: watch, setInfo, toString
                    add a constructor that can set the fields

 */

public class TV extends Device{

    public boolean hasRemote;

    public TV(String brand, String model, double price, String screenSize, boolean hasBattery, boolean hasMemory, boolean hasRemote){
        this.hasRemote = hasRemote;
        setInfo(brand, model, price, hasBattery, hasMemory,screenSize);
    }

    public void watch(){
        System.out.println("Watching "+brand+" "+model);
    }


}

package main;

public class Plane extends Vehicle{

    public Plane(String manufacturer, String model, int maxSpeed){
        super("Lentokone", manufacturer, model, maxSpeed);
        this.engine = new Engine("Suihkumoottori", 500);
    }
    
    public static void fly(Vehicle vehicle){
        System.out.println(vehicle.manufacturer+" "+vehicle.model+" lentää kohteeseen!");
    }

}

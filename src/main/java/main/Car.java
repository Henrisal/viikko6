package main;

public class Car extends Vehicle{
    

    public Car(String manufacturer, String model, int maxSpeed){
        super("Auto", manufacturer, model, maxSpeed);
        this.engine = new Engine("V8", 300);
        
    }

    public static void drive(Vehicle vehicle){
        System.out.println(vehicle.manufacturer+" "+vehicle.model+" paahtaa tietä eteenpäin!");
    }

}

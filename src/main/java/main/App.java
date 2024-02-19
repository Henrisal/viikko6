package main;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        Vehicle newVehicle = null;

        boolean exit = false;
        while(!exit){
            System.out.println("1) Luo uusi kulkuneuvo, 2) Listaa kulkuneuvot 3) Aja autoja, 4) Lennä lentokoneita, 5) Seilaa laivoja, 0) Lopeta ohjelma");
            if(sc.hasNext()) {
                int i = 0;
                String stringInput = sc.nextLine();
                i = Integer.parseInt(stringInput);

                switch(i) {

                    case 1:
                    System.out.println("Minkä kulkuneuvon haluat rakentaa? 1) auto, 2) lentokone, 3) laiva");
                    stringInput = sc.nextLine();
                    i = Integer.parseInt(stringInput);

                    System.out.println("Anna kulkuneuvon valmistaja:");
                    String mf = sc.nextLine();
                    System.out.println("Anna kulkuneuvon malli:");
                    String md = sc.nextLine();
                    System.out.println("Anna kulkuneuvon huippunopeus:");
                    String speedstring = sc.nextLine();
                    int speed = Integer.parseInt(speedstring);
                    if(i == 1) {
                        newVehicle = new Car(mf, md, speed);
                    } else if(i == 2) {
                        newVehicle = new Plane(mf, md, speed);
                    } else if(i==3) {
                        newVehicle = new Ship(mf, md, speed);
                    }
                    vehicles.add(newVehicle);
        
                    break;
                    case 2:
                    for(Vehicle vehicle : vehicles) {
                        vehicle.printSpecs();
                    }

                    break;
                    case 3:
                    for(Vehicle vehicle : vehicles) {
                    if(vehicle instanceof Car){
                        Car.drive(vehicle);
                    }
                }
                    break;
                    case 4:
                    for(Vehicle vehicle : vehicles) {
                        if(vehicle instanceof Plane){
                            Plane.fly(vehicle);
                        }
                    }
                    
                    break;

                    case 5:
                    for(Vehicle vehicle : vehicles) {
                        if(vehicle instanceof Ship){
                            Ship.sail(vehicle);
                        }
                    }

                    break;
                    case 0:
                    System.out.println("Kiitos ohjelman käytöstä.");
                        exit = true;
                        break;
                    default:
                        System.out.println("Syöte oli väärä");
                        break;

                }

        }
    }
    sc.close();
}

}

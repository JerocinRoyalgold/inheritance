
class Vehicle{
    String brand;
    int year; 

    void startEngine()
    {
        
    }
}
class Car extends Vehicle{
    String fuelType;

    void startEngine(){
        System.out.println("Car engine starts");
    }

    void Drive(){
        System.out.println("Car is driving");
    }
}
class Truck extends Vehicle{
    int loadCapacity;

    void startEngine(){
        System.out.println("Truck engine starts");
    }

    void haul(){
        System.out.println("Truck is hauling");
    }
}
public class VehicleEx{
        public static void main(String[] args){
        Car c1=new Car();
        c1.fuelType="Petrol";
        c1.startEngine();
        c1.Drive();

        Truck t1=new Truck();
        t1.loadCapacity=45;
        t1.startEngine();
        t1.haul();
    }
}

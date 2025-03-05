class Vehicle {
    String Brand;
    int Year;
    void startEngine() {
        System.out.println("Vehicle engine starts");
    }
}

class Car extends Vehicle {
    String FuelType;
    void startEngine() {
        System.out.println("Car engine starts");
    }
    void drive() {
        System.out.println("Car is driving");
    }
}
class Truck extends Vehicle {
    int loadCapacity;
    void startEngine() {
        System.out.println("Truck engine starts");
    }
    void haul() {
        System.out.println("Truck is hauling");
    }
}
public class Heirarchy {
    public static void main(String[] args) {
        Car obj = new Car();
        obj.Brand = "Hyundai";
        System.out.println(obj.Brand);
        obj.FuelType = "Petrol";
        obj.Year = 2022;

        obj.startEngine();
        obj.drive();

        Truck truckObj = new Truck();
        truckObj.Brand = "Volvo";
        truckObj.loadCapacity = 10000;
        truckObj.Year = 2021;

        truckObj.startEngine();
        truckObj.haul();
    }
}
  
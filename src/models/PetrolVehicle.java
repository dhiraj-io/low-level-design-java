package models;

import enums.TransmissionType;
import enums.VehicleType;
import interfaces.Refuelable;

public class PetrolVehicle extends Vehicle implements Refuelable {
    private Engine engine;

    public PetrolVehicle(String brand, String modelName, double price, int capacity, TransmissionType transmissionType,
    Engine engine)
    {
        super(brand, modelName, price, capacity, transmissionType);
        this.engine = engine;
        this.vehicleType = VehicleType.PETROL;
    }


    @Override
    public void refuel() {
        System.out.println(" Petrol Vehicle is refueling");
    }


    @Override
    public void drive() {
        System.out.println("Drive Petrol vehicle ");
    }
}

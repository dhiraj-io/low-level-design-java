package models;

import enums.TransmissionType;
import enums.VehicleType;
import interfaces.Refuelable;

public class HybridVehicle extends Vehicle implements Refuelable {
    private Engine engine;
    private Battery battery;

    public HybridVehicle(String brand, String modelName, double price, int capacity, TransmissionType transmissionType,
                         Engine engine, Battery battery)
    {
        super(brand, modelName, price, capacity, transmissionType);
        this.engine = engine;
        this.vehicleType = VehicleType.HYBRID;
        this.battery = battery;
    }

    @Override
    public void refuel() {
        System.out.println("Hybrid vehicle is refueling");
    }

    @Override
    public void drive() {
        System.out.println("Drive Hybrid vehicle");
    }
}

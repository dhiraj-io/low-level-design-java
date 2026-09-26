package models;

import enums.TransmissionType;
import enums.VehicleType;

public abstract class Vehicle {
    protected String brand;
    protected String modelName;
    protected double price;
    protected int capacity;
    protected TransmissionType transmissionType;
    protected VehicleType vehicleType;
    // Vehicle.java
    public Vehicle(String brand, String modelName, double price, int capacity,
                   TransmissionType transmissionType) {
        this.brand = brand;
        this.modelName = modelName;
        this.price = price;
        this.capacity = capacity;
        this.transmissionType = transmissionType;
    }
    public abstract void drive();
}

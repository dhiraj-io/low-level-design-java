package models;

import enums.TransmissionType;
import enums.VehicleType;
import interfaces.Chargeable;

public class ElectricVehicle extends Vehicle implements Chargeable {
    private Battery battery;

    public ElectricVehicle(String brand, String modelName, double price, int capacity, TransmissionType transmissionType,
                         Battery battery)
    {
        super(brand, modelName, price, capacity, transmissionType);
        this.battery = battery;
        this.vehicleType = VehicleType.ELECTRIC;
    }

    @Override
    public void charge() {
        System.out.println("Electric vehicle is charging");
    }

    @Override
    public void drive() {
        System.out.println("Drive Electric vehicle");
    }
}

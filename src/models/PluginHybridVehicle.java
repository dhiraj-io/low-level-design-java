package models;

import enums.TransmissionType;
import enums.VehicleType;
import interfaces.Chargeable;

public class PluginHybridVehicle extends HybridVehicle implements Chargeable {

    public PluginHybridVehicle(String brand, String modelName, double price, int capacity, TransmissionType transmissionType,
                        Engine engine, Battery battery )
    {
        super(brand, modelName, price, capacity, transmissionType,engine, battery);
        this.vehicleType = VehicleType.PLUGIN_HYBRID;
    }
    @Override
    public void charge() {
        System.out.println("Plugin Hybrid Vehicle is charging");
    }

    @Override
    public void drive() {
        System.out.println("Drive Plugin Hybrid Vehicle");
    }
}

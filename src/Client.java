import enums.TransmissionType;
import interfaces.Chargeable;
import interfaces.Refuelable;
import models.*;

public class Client {
    public static void main(String[] args) {

        Engine engine = new Engine();
        Battery battery = new Battery();

        System.out.println("--- Polymorphism via Vehicle reference ---");
        Vehicle petrolVehicle = new PetrolVehicle("Toyota", "Camry", 2500000, 5, TransmissionType.AUTOMATIC, engine);
        petrolVehicle.drive();

        Vehicle electricVehicle = new ElectricVehicle("Tesla", "Model 3", 4500000, 5, TransmissionType.AUTOMATIC, battery);
        electricVehicle.drive();

        Vehicle hybridVehicle = new HybridVehicle("Toyota", "Prius", 3500000, 5, TransmissionType.AUTOMATIC, engine, battery);
        hybridVehicle.drive();

        Vehicle pluginHybrid = new PluginHybridVehicle("BMW", "330e", 5500000, 5, TransmissionType.AUTOMATIC, engine, battery);
        pluginHybrid.drive();

        System.out.println("\n--- Interface reference ---");
        Refuelable refuelable = new PetrolVehicle("Honda", "Civic", 2000000, 5, TransmissionType.MANUAL, engine);
        refuelable.refuel();

        Chargeable chargeable = new ElectricVehicle("Tata", "Nexon", 1500000, 5, TransmissionType.AUTOMATIC, battery);
        chargeable.charge();

        System.out.println("\n--- Full access via concrete type ---");
        PetrolVehicle petrolFull = new PetrolVehicle("BMW", "5 Series", 6000000, 5, TransmissionType.AUTOMATIC, engine);
        petrolFull.drive();
        petrolFull.refuel();

        PluginHybridVehicle phev = new PluginHybridVehicle("BMW", "330e", 5500000, 5, TransmissionType.AUTOMATIC, engine, battery);
        phev.drive();
        phev.refuel();
        phev.charge();
    }
}
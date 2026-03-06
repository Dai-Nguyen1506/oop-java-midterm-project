package VehicleFactory;

import VehicleFactory.Factories.Factory;
import VehicleFactory.Vehicles.Vehicle;

// Client class
public class Client {
    private Vehicle pVehicle;

    public Client(Factory factory) {
        pVehicle = factory.createVehicle();
    }

    public Vehicle getVehicle() {
        return pVehicle; 
    }
}

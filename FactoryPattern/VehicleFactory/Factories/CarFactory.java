package VehicleFactory.Factories;

import VehicleFactory.Vehicles.Car;
import VehicleFactory.Vehicles.Vehicle;

public class CarFactory implements Factory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}
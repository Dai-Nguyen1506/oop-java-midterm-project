package VehicleFactory.Factories;

import VehicleFactory.Vehicles.Motobike;
import VehicleFactory.Vehicles.Vehicle;

public class MotobikeFactory implements Factory {
    @Override
    public Vehicle createVehicle() {
        return new Motobike();
    }
}

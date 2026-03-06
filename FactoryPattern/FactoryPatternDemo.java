import VehicleFactory.*;
import VehicleFactory.Factories.*;
import VehicleFactory.Vehicles.*;

// Driver program
public class FactoryPatternDemo {
    public static void main(String[] args)
    {
        Factory MotoFactory = new MotobikeFactory();
        Client MotoClient = new Client(MotoFactory);
        Vehicle Moto = MotoClient.getVehicle();
        Moto.printVehicle();

        Factory CarFactory = new CarFactory();
        Client CarClient = new Client(CarFactory);
        Vehicle Car = CarClient.getVehicle();
        Car.printVehicle();
    }
}
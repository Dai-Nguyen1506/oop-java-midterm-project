// Library classes
abstract class VehicleNoFactory {
    public abstract void printVehicle();
}

class TwoWheelerNoFactory extends VehicleNoFactory {
    public void printVehicle()
    {
        System.out.println("I am two wheeler");
    }
}

class FourWheelerNoFactory extends VehicleNoFactory {
    public void printVehicle()
    {
        System.out.println("I am four wheeler");
    }
}

// Client (or user) class
class ClientNoFactory {
    private VehicleNoFactory Vehicle;

    public ClientNoFactory(int type)
    {
        if (type == 1) {
            Vehicle = new TwoWheelerNoFactory();
        }
        else if (type == 2) {
            Vehicle = new FourWheelerNoFactory();
        }
        else {
            Vehicle = null;
        }
    }

    public void cleanup()
    {
        if (Vehicle != null) {
            Vehicle = null;
        }
    }

    public VehicleNoFactory getVehicle() { return Vehicle; }
}

// Driver Code
public class NoFactorPattern {
    public static void main(String[] args) {
        ClientNoFactory Client = new ClientNoFactory(1);
        VehicleNoFactory Vehicle = Client.getVehicle();
        if (Vehicle != null) {
            Vehicle.printVehicle();
        }
        Client.cleanup();
    }
}
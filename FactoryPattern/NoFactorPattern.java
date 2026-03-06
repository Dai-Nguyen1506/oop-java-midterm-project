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
    private VehicleNoFactory pVehicle;

    public ClientNoFactory(int type)
    {
        if (type == 1) {
            pVehicle = new TwoWheelerNoFactory();
        }
        else if (type == 2) {
            pVehicle = new FourWheelerNoFactory();
        }
        else {
            pVehicle = null;
        }
    }

    public void cleanup()
    {
        if (pVehicle != null) {
            pVehicle = null;
        }
    }

    public VehicleNoFactory getVehicle() { return pVehicle; }
}

// Driver Code
public class NoFactorPattern {
    public static void main(String[] args) {
        ClientNoFactory pClient = new ClientNoFactory(1);
        VehicleNoFactory pVehicle = pClient.getVehicle();
        if (pVehicle != null) {
            pVehicle.printVehicle();
        }
        pClient.cleanup();
    }
}
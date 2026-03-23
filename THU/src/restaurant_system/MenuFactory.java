package restaurant_system;

public class MenuFactory {
    public static Command getCommand(String type, Chef chef) {
        if (type.equalsIgnoreCase("pizza")) {
            return new PizzaCommand(chef);
        } else if (type.equalsIgnoreCase("steak")) {
            return new SteakCommand(chef);
        }
        return null;
    }
}
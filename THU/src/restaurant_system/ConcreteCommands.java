package restaurant_system;

// Món Pizza
class PizzaCommand implements Command {
    private Chef chef;
    public PizzaCommand(Chef chef) { this.chef = chef; }
    @Override public void execute() { chef.cook("Pizza Hải sản"); }
    @Override public void undo() { chef.cancel("Pizza Hải sản"); }
    @Override public String getName() { return "Pizza Hải sản"; }
}

// Món Steak
class SteakCommand implements Command {
    private Chef chef;
    public SteakCommand(Chef chef) { this.chef = chef; }
    @Override public void execute() { chef.cook("Bít tết bò Mỹ"); }
    @Override public void undo() { chef.cancel("Bít tết bò Mỹ"); }
    @Override public String getName() { return "Bít tết bò Mỹ"; }
}
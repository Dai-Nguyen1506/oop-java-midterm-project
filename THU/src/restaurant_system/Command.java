package restaurant_system;

public interface Command {
    void execute();
    void undo();
    String getName();
}
package command;

public class MainApp {
    public static void main(String[] args) {
        var chef = new Chef();
        var waiter = new Waiter();

        Command pizza = new Command() {
            @Override public void execute() { chef.cookPizza(); }
            @Override public void undo() { chef.cancelPizza(); }
        };

        Command pasta = new Command() {
            @Override public void execute() { chef.cookPasta(); }
            @Override public void undo() { chef.cancelPasta(); }
        };

        Command steak = new Command() {
            @Override public void execute() { chef.cookSteak(); }
            @Override public void undo() { chef.cancelSteak(); }
        };

        waiter.takeOrder(pizza);
        waiter.takeOrder(pasta);

        waiter.clickUndo(); 

        waiter.takeOrder(steak);
        
        System.out.println("\n--- Kết thúc buổi thuyết trình ---");
    }
}
package command;
import java.util.Stack;

public class Waiter {
    private Stack<Command> history = new Stack<>();

    public void takeOrder(Command command) {
        command.execute(); // Waiter chỉ biết gọi hàm này
        history.push(command);
    }

    public void clickUndo() {
        if (!history.isEmpty()) {
            System.out.println("\n--- [Hành động] Hoàn tác món cuối cùng ---");
            history.pop().undo(); // Lấy "phiếu" ra và ấn nút Undo
        } else {
            System.out.println("Không còn gì để hoàn tác.");
        }
    }
}
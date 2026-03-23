package restaurant_system;

import java.util.Iterator;
import java.util.Stack;

public class Waiter {
    // Cái "túi" thần kỳ để lưu lịch sử phục vụ
    private Stack<Command> history = new Stack<>();

    public void serve(OrderList orderList) {
        System.out.println("\n=== [Waiter] Đang phục vụ các món trong sổ... ===");
        Iterator<Command> it = orderList.getIterator();
        
        while (it.hasNext()) {
            Command dish = it.next();
            dish.execute(); // Thực thi
            history.push(dish); // Ghi nhớ vào lịch sử ngay sau khi làm
        }
    }

    // Đây mới là hàm Undo "xịn": Waiter không cần biết món gì!
    public void clickUndo() {
        if (!history.isEmpty()) {
            Command lastAction = history.pop();
            System.out.println("\n[Waiter] Đang hoàn tác món: " + lastAction.getName());
            lastAction.undo();
        } else {
            System.out.println("\n[Waiter] Chẳng còn gì để hoàn tác cả!");
        }
    }
}
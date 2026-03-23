package restaurant_system;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrderList {
    private List<Command> orders = new ArrayList<>();

    public void addOrder(Command command) {
        orders.add(command);
        System.out.println("[Hệ thống] Đã thêm vào sổ: " + command.getName());
    }

    // Trả về Iterator chuẩn của Java để duyệt danh sách
    public Iterator<Command> getIterator() {
        return orders.iterator();
    }
}
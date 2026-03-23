package restaurant_system;

public class MainApp {
    public static void main(String[] args) {
        Chef chef = new Chef();
        Waiter waiter = new Waiter();
        OrderList table01 = new OrderList();

        // 1. Factory tạo món (Client chọn món)
        table01.addOrder(MenuFactory.getCommand("pizza", chef));
        table01.addOrder(MenuFactory.getCommand("steak", chef));
        table01.addOrder(MenuFactory.getCommand("pizza", chef));

        // 2. Waiter phục vụ (Dùng Iterator duyệt và lưu vào Stack)
        waiter.serve(table01);
        
        // 3. Khách đổi ý: "Tôi muốn trả lại món vừa lên!"
        // Waiter chỉ việc bấm nút Undo, không cần quan tâm món đó là Pizza hay Steak
        waiter.clickUndo(); 
        
        // Thử Undo thêm lần nữa
        waiter.clickUndo();
    }
}
package restaurant_system;

public class Chef {
    public void cook(String dish) {
        System.out.println("-> [Đầu bếp] Đang nấu món: " + dish + " (Xèo xèo...)");
    }

    public void cancel(String dish) {
        System.out.println("-> [Đầu bếp] Đã dừng làm món: " + dish);
    }
}
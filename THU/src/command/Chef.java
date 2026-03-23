package command;

public class Chef {
    public void cookPizza() { System.out.println("-> [Đầu bếp] Đang làm Pizza nóng hổi..."); }
    public void cancelPizza() { System.out.println("-> [Đầu bếp] Đã dừng làm Pizza."); }

    public void cookSteak() { System.out.println("-> [Đầu bếp] Đang áp chảo Bít tết..."); }
    public void cancelSteak() { System.out.println("-> [Đầu bếp] Đã dừng làm Bít tết."); }

    public void cookPasta() { System.out.println("-> [Đầu bếp] Đang luộc mì Pasta..."); }
    public void cancelPasta() { System.out.println("-> [Đầu bếp] Đã dừng làm Pasta."); }
}
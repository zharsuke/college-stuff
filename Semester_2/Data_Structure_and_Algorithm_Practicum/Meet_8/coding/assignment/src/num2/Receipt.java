package num2;

public class Receipt {
    public int id, qty, total;
    public String date;

    public Receipt(int id, int qty, int total, String date) {
        this.id = id;
        this.qty = qty;
        this.total = total;
        this.date = date;
    }
}

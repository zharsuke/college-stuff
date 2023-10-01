package Exp3;

public class Product {
    public String name, type;
    public int stock;

    public void printProduct() {
        System.out.println("Product name: " + name);
        System.out.println("Product type: " + type);
        System.out.println("Stock: " + stock);
    }

    // method
    public int addStock(int stockIn) {
        int newStock = stockIn + stock;
        return newStock;
    }
}

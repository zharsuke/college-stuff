package Exp3;

public class TestProduct {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.name = "pencil";
        product1.type = "ATK";
        product1.stock = 10;
        product1.printProduct();
        // display and fill argument to add product stock
        System.out.println("New stock: " + product1.addStock(20));
    }
}

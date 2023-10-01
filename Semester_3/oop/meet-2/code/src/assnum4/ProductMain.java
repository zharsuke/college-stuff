package assnum4;

public class ProductMain {
    public static void main(String[] args) {
        Product product1 = new Product();
        product1.code =  "123";
        product1.name = "laptop";
        product1.basePrice = 15_000_000;
        product1.discount = 0.25f;
        product1.printData();
    }
}

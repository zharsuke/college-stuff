package assnum4;

public class Product {
    public String code, name;
    public int basePrice;
    public float discount;

    public void printData() {
        System.out.println("Code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Base price: " + basePrice + " IDR");
        System.out.println("Discount: " + discount + "%");
        System.out.println("Sale price: " + calculateSalePrice());
    }

    public int calculateSalePrice() {
        float salePriceFloat = basePrice - (discount * basePrice);
        int salePrice = (int) salePriceFloat;
        return salePrice;
    }
}

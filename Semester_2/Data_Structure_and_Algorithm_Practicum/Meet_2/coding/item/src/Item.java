public class Item {
    String nameItem, itemType;
    int stock, priceItem;
    
    Item() {
    }
    Item(String name, String type, int price, int stock) {
        this.nameItem = name;
        this.itemType = type;
        this.stock = stock;
        this.priceItem = price;
    }
    void printItem() {
        System.out.println("Name = " + nameItem);
        System.out.println("Type = " + itemType);
        System.out.println("Stock = " + stock);
        System.out.println("Price item = " + priceItem);
    }
    void addStock(int n) {
        stock += n;
    }
    void subStock(int n) {
        if (stock > 1) {
            System.out.println("Stok is available");
            if (stock <= 0) {
                stock -= n;
            }
        } else {
            System.out.println("Out of stock");
        }
    }
    int calTotalPrice(int amount) {
        return amount * priceItem;
    }
}

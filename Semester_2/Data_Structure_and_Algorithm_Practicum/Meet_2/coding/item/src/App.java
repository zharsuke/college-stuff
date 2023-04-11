public class App {
    public static void main(String[] args) throws Exception {
        Item item1 = new Item();
        item1.nameItem = "Corsair 2GB";
        item1.itemType = "DDR";
        item1.priceItem = 250000;
        item1.stock = 10;
        item1.addStock(1);
        item1.subStock(3);
        item1.printItem();
        int totalPrice = item1.calTotalPrice(4);
        System.out.println("Price of 4 item = " + totalPrice);

        Item item2 = new Item("Logitech", "Wireless Mouse", 150000, 0);
        item2.subStock(0);
        item2.printItem();

        Item b3 = new Item("Miniso", "Headphone", 140000, 10);

    }
}

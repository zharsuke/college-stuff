public class App {
    public static void main(String[] args) throws Exception {
        Item keyboard = new Item();
        keyboard.name = "Red Dragon";
        keyboard.unitPrice = 350_000;
        keyboard.qty = 2;
        System.out.println("Total price = " + keyboard.calculateTotalPrice(keyboard.unitPrice, keyboard.qty));
        System.out.println("Discount = " + keyboard.calculateDiscount());
        System.out.println("Final price = " + keyboard.calculateFinalPrice());
    }
}
public class Item {
    String name;
    int unitPrice, qty;
    Item() {

    }
    Item(String name, int unitPrice, int qty) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.qty = qty;
    }
    int calculateTotalPrice(int unitPrice, int qty) {
        return qty * unitPrice;
    }
    int calculateDiscount() {
        int totalPrice = calculateTotalPrice(unitPrice, qty);
        if (totalPrice > 100000) {
            double totaltoDouble = (double) totalPrice;
            double discounttoDouble = totaltoDouble * 0.10;
            int discounttoInt = (int) discounttoDouble;
            return discounttoInt;
        } else if (calculateTotalPrice(unitPrice, qty) >= 50000 && calculateTotalPrice(unitPrice, qty) <= 100000) {
            double totaltoDouble = (double) totalPrice;
            double discounttoDouble = totaltoDouble * 0.05;
            int discounttoInt = (int) discounttoDouble;
            return discounttoInt;
        } else {
            return 0;
        }
    }
    int calculateFinalPrice() {
        return calculateTotalPrice(unitPrice, qty) - calculateDiscount();
    }
}

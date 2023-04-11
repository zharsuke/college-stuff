public class App {
    public static void main(String[] args) throws Exception {
        RentalData customer1 = new RentalData();
        customer1.memberId = 1;
        customer1.memberName = "Azhar";
        customer1.gameName = "Resident Evil Village";
        customer1.dailyPrice = 20_000;
        customer1.day = 5;
        customer1.printData();
        System.out.println("Total Price = " + customer1.totalPrice(customer1.dailyPrice, customer1.day));        
    }
}

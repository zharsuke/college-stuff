package assnum2;

public class BorrowMain {
    public static void main(String[] args) {
        Borrow borrow1 = new Borrow();
        borrow1.id = 1;
        borrow1.member_name = "Azhar";
        borrow1.game_name = "GTA";
        borrow1.price = 50_000;
        borrow1.printBorrow();
        int amountDays = 1;
        System.out.println("Amount days of borrow: " + amountDays);
        System.out.println("Total bill: " + borrow1.bill(amountDays));
    }
}

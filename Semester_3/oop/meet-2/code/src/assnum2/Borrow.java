package assnum2;

public class Borrow {
    public int id;
    public String member_name, game_name;
    public double price;

    public double bill(int amountDays) {
        double total = price * amountDays;
        return total;
    }

    public void printBorrow() {
        System.out.println("Id : " + id);
        System.out.println("Member name : " + member_name);
        System.out.println("Game name : " + game_name);
        System.out.println("Price : " + price);
    }
}

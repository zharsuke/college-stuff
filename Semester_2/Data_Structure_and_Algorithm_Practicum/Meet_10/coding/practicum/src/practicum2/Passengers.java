package practicum2;

public class Passengers {
    public String name, cityOrigin, cityDestination;
    public int ticketAmount, price;

    public Passengers(String name, String cityOrigin, String cityDestination, int ticketAmount, int price) {
        this.name = name;
        this.cityOrigin = cityOrigin;
        this.cityDestination = cityDestination;
        this.ticketAmount = ticketAmount;
        this.price = price;
    }
}

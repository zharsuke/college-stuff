public class Tickets {
    public String airlines, destination, origin;
    public int price;

    Tickets(String airlines, String destination, String origin, int price) {
        this.airlines = airlines;
        this.destination = destination;
        this.origin = origin;
        this.price = price;
    }

    void print() {
        System.out.println("Airlines = " + airlines);
        System.out.println("Destination = " + destination);
        System.out.println("Origin = " + origin);
        System.out.println("Price = " + price);
    }
}

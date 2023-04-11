public class RentalData {
    int memberId;
    String memberName, gameName;
    double dailyPrice, day;
    void printData() {
        System.out.println("member Id = " + memberId);
        System.out.println("member name = " + memberName);
        System.out.println("Game Name = " + gameName);
        System.out.println("Daily = " + dailyPrice);
        System.out.println("Day = " + day);
    }
    double totalPrice(double dailyPrice, double day) {
        return dailyPrice * day;
    }
}
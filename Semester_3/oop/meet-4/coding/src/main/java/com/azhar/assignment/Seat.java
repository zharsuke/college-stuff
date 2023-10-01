package com.azhar.assignment;

public class Seat {
    private String number;
    private Passenger passenger;

    public Seat(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String printSeat() {
        String info = "";
        if (this.passenger != null) {
            info += "Number = " + number + "\n";
            info += "Passenger Information : \n" + this.passenger.printPassenger();
        }
        return info;
    }
}

package com.azhar.exp4;

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

    public String info() {
        String info = "";
        info += "Number = " + number + "\n";
        if (this.passenger != null) {
            info += "Passenger = " + this.passenger.info() + "\n";
        }
        return info;
    }
}

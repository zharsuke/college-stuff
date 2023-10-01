package com.azhar.assignment;

public class Ticket {
    private Passenger passenger;
    private String codeBooking;
    private Train train;
    private Carriage carriage;
    private Seat seat;
    private String departureDate;
    private String arrivalDate;
    private String departureTime;
    private String arrivalTime;
    private Station departureStation;
    private Station arrivalStation;

    public Ticket(Passenger passenger, String codeBooking, Train train, Carriage carriage, Seat seat, String departureDate, String arrivalDate, String departureTime, String arrivalTime, Station departureStation, Station arrivalStation) {
        this.passenger = passenger;
        this.codeBooking = codeBooking;
        this.train = train;
        this.carriage = carriage;
        this.seat = seat;
        this.departureDate = departureDate;
        this.arrivalDate = arrivalDate;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.departureStation = departureStation;
        this.arrivalStation = arrivalStation;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public String getCodeBooking() {
        return codeBooking;
    }

    public Train getTrain() {
        return train;
    }

    public Carriage getCarriage() {
        return carriage;
    }

    public Seat getSeat() {
        return seat;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public Station getDepartureStation() {
        return departureStation;
    }

    public Station getArrivalStation() {
        return arrivalStation;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public void setCodeBooking(String codeBooking) {
        this.codeBooking = codeBooking;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public void setCarriage(Carriage carriage) {
        this.carriage = carriage;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void setDepartureStation(Station departureStation) {
        this.departureStation = departureStation;
    }

    public void setArrivalStation(Station arrivalStation) {
        this.arrivalStation = arrivalStation;
    }

    public void printTicket() {
        System.out.println("==========Ticket==========");
        System.out.println("Train Information:");
        System.out.println("Code Booking = " + getCodeBooking());
        System.out.println(getTrain().getName() + " - " + getTrain().getCarriageClass());
        System.out.println("Seat: " + getSeat().getNumber());
        System.out.println(getCarriage().printCarriage());
        System.out.println("Departure Date = " + getDepartureDate());
        System.out.println("Arrival Date = " + getArrivalDate());
        System.out.println("Departure Time = " + getDepartureTime());
        System.out.println("Arrival Time = " + getArrivalTime());
        System.out.println("Departure Station :");
        System.out.println(getDepartureStation().printStation());
        System.out.println("Arrival Station :");
        System.out.println(getArrivalStation().printStation());
        System.out.println("==========================");
    }
}

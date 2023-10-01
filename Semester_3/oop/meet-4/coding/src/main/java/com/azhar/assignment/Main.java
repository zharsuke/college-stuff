package com.azhar.assignment;

public class Main {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("1234", "Azhar", "Sukarno Hatta Street", "ajar@gmail.com", 20);
        Seat seat1A = new Seat("1A");
        Carriage carriage1 = new Carriage("1", 10);
        Train malioboro = new Train("Malioboro", "Executive", 10);
        malioboro.setCarriage(carriage1, 1);
        carriage1.setPassenger(passenger, 1);
        Station departureStation = new Station("Malang Kota Baru Station", "Malang City");
        Station arrivalStation = new Station("Tugu Yogyakarta Station", "Yogyakarta");
        Ticket ticket = new Ticket(passenger, "BOOK-1234", malioboro, carriage1, seat1A, "2023-09-20", "2023-09-21", "08:00", "10:00", departureStation, arrivalStation);
        ticket.printTicket();
    }
}

package com.azhar.exp4;

public class MainExp4 {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("1234", "Azhar");
        Carriage carriage = new Carriage("A", 10);
        carriage.setPassenger(passenger, 1);
        System.out.println(carriage.info());
    }
}

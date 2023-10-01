package com.azhar.exp4;

public class Carriage {
    private String code;
    private Seat[] arraySeat;

    public Carriage(String code, int amount) {
        this.code = code;
        this.arraySeat = new Seat[amount];
        this.initSeat();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setPassenger(Passenger passenger, int number) {
        if (arraySeat[number - 1].getPassenger() == null) {
            arraySeat[number - 1].setPassenger(passenger);
        } else {
            System.out.println("Seat " + number + " is already occupied.");
        }
    }

    public Seat[] getArraySeat() {
        return arraySeat;
    }

    private void initSeat() {
        for (int i = 0; i < arraySeat.length; i++) {
            this.arraySeat[i] = new Seat(String.valueOf(i + 1));
        }
    }

    public String info() {
        String info = "";
        info += "Code = " + code + "\n";
        for (Seat seat : arraySeat) {
            info += seat.info();
        }
        return info;
    }
}

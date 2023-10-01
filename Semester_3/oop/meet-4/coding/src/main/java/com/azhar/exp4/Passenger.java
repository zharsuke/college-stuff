package com.azhar.exp4;

public class Passenger {
    private String idCard;
    private String name;

    public Passenger(String idCard, String name) {
        this.idCard = idCard;
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public String getName() {
        return name;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String info() {
        String info = "";
        info += "ID Card = " + idCard + "\n";
        info += "Name = " + name;
        return info;
    }
}

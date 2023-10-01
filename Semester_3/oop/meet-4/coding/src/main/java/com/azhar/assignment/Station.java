package com.azhar.assignment;

public class Station {
    private String name;
    private String city;

    public Station(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String printStation() {
        String info = "";
        info += "Name = " + name + "\n";
        info += "City = " + city;
        return info;
    }
}

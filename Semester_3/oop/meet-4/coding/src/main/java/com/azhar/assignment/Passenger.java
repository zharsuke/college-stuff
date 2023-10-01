package com.azhar.assignment;

public class Passenger {
    private String idCard;
    private String name;
    private String address;
    private String email;
    private int age;

    public Passenger(String idCard, String name, String address, String email, int age) {
        this.idCard = idCard;
        this.name = name;
        this.address = address;
        this.email = email;
        this.age = age;
    }

    public String getIdCard() {
        return idCard;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String printPassenger() {
        String info = "";
        info += "ID Card = " + idCard + "\n";
        info += "Name = " + name + "\n";
        info += "Address = " + address + "\n";
        info += "Email = " + email + "\n";
        info += "Age = " + age;
        return info;
    }
}

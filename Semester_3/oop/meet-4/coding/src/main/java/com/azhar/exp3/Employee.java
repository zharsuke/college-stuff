package com.azhar.exp3;

public class Employee {
    private String nip;
    private String name;

    public Employee(String nip, String name) {
        this.nip = nip;
        this.name = name;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getNip() {
        return nip;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String info() {
        String info = "";
        info += "NIP = " + nip + "\n";
        info += "Name = " + name + "\n";
        return info;
    }
}
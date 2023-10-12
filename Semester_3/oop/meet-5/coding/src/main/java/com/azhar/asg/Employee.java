package com.azhar.asg;

public class Employee {
    private String nip;
    private String name;
    private String address;

    public Employee() {
        
    }

    public Employee(String nip, String name, String address) {
        this.nip = nip;
        this.name = name;
        this.address = address;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNip() {
        return nip;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return 0;
    }
}

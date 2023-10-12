package com.azhar.asg;

public class Employee {
    private String nip;
    private String name;
    private String address;
    private int salary;

    public Employee() {
        
    }

    public Employee(String nip, String name, String address, int salary) {
        this.nip = nip;
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

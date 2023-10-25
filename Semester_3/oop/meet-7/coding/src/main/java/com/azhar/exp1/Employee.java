package com.azhar.exp1;

public class Employee {
    public String name, address, gender;
    public int age, salary;

    public Employee() {

    }

    public Employee(String name, String address, String gender, int age, int salary) {
        this.name = name;
        this.address = address;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
    }

    public void printDataEmployee() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

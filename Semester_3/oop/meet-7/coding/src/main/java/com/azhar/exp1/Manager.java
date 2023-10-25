package com.azhar.exp1;

public class Manager extends Employee {
    public int allowance;

    public Manager() {
        
    }

    public void printDataManager() {
        super.printDataEmployee();
        System.out.println("Allowance: " + allowance);
        System.out.println("Total Salary: " + (super.salary + allowance));

    }
}

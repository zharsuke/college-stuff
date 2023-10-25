package com.azhar.exp1;

public class Staff extends Employee {
    public int overtime, deduction;

    public Staff() {
        
    }

    public Staff(String name, String address, String gender, int age, int salary, int overtime, int deduction) {
        super(name, address, gender, age, salary);
        this.overtime = overtime;
        this.deduction = deduction;
    }

    public void printDataStaff() {
        super.printDataEmployee();
        System.out.println("Overtime: " + overtime);
        System.out.println("Deduction: " + deduction);
        System.out.println("Total Salary: " + (salary + overtime - deduction));
    }
}

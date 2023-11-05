package com.azhar.exp;

public class Staff extends Employee {
    private int overTime;
    private double overTimeSalary;

    public void setOverTime(int overTime) {
        this.overTime = overTime;
    }

    public void setOverTimeSalary(double overTimeSalary) {
        this.overTimeSalary = overTimeSalary;
    }

    public int getOverTime() {
        return overTime;
    }

    public double getOverTimeSalary() {
        return overTimeSalary;
    }

    public double getSalary(int overTime, double overTimeSalary) {
        return super.getSalary() + (overTime * overTimeSalary);
    }

    public double getSalary() {
        return super.getSalary() + (overTime * overTimeSalary);
    }

    public void print() {
        System.out.println("Name : " + this.getName());
        System.out.println("NIP : " + this.getNip());
        System.out.println("Group : " + this.getGroup());
        System.out.println("Amount of over time : " + this.getOverTime());
        System.out.printf("Over time salary : %.0f\n", this.getOverTimeSalary());
        System.out.printf("Salary : %.0f\\n", this.getSalary());
    }
}

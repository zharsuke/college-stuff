package com.azhar.exp1;

public class DailyStaff extends Staff {
    public int amountWorkingHours;

    public DailyStaff() {
        
    }

    public DailyStaff(String name, String address, String gender, int age, int salary, int overtime, int deduction, int amountWorkingHours) {
        super(name, address, gender, age, salary, overtime, deduction);
        this.amountWorkingHours = amountWorkingHours;
    }

    public void printDataDailyStaff() {
        System.out.println("==========Data Daily Staff==========");
        super.printDataStaff();
        System.out.println("Amount Working Hours: " + amountWorkingHours);
        System.out.println("Net Salary: " + (salary * amountWorkingHours + overtime - deduction));
    }
}

package com.azhar.exp1;

public class FixedStaff extends Staff {
    public String group;
    public int assurance;

    public FixedStaff() {
        
    }

    public FixedStaff(String name, String address, String gender, int age, int salary, int overtime, int deduction , String group, int assurance) {
        super(name, address, gender, age, salary, overtime, deduction);
        this.group = group;
        this.assurance = assurance;
    }

    public void printDataFixedStaff() {
        System.out.println("==========Data Fixed Staff==========");
        super.printDataStaff();
        System.out.println("Group: " + group);
        System.out.println("Assurance: " + assurance);
        System.out.println("Net Salary: " + (salary + overtime - deduction - assurance));
    }
}

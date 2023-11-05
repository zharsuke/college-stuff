package com.azhar.exp;

public class Manager extends Employee {
    private double allowance;
    private String section;
    private Staff st[];

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public void setStaff(Staff[] st) {
        this.st = st;
    }

    public double getAllowance() {
        return allowance;

    }

    public String getSection() {
        return section;
    }

    public void viewStaff() {
        System.out.println("================");
        for (int i = 0; i < st.length; i++) {
            st[i].print();
        }
        System.out.println("================");
    }

    public void print() {
        System.out.println("Manager : " + this.getSection());
        System.out.println("Name : " + this.getName());
        System.out.println("NIP : " + this.getNip());
        System.out.println("Group : " + this.getGroup());
        System.out.println("Section : " + this.getSection());
        System.out.println("Allowance : " + this.getAllowance());
        System.out.printf("Salary : %.0f\n", this.getSalary());
    }

    public double getSalary() {
        return super.getSalary() + allowance;
    }
}

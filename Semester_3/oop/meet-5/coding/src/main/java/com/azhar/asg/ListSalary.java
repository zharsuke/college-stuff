package com.azhar.asg;

public class ListSalary {
    private Employee employee[];

    public ListSalary(int size) {
        this.employee = new Employee[size];
    }

    public void addEmployee(Employee employee) {
        for (int i = 0; i < this.employee.length; i++) {
            if (this.employee[i] == null) {
                this.employee[i] = employee;
                break;
            }
        }
    }

    public void printAllSalary() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println("Salary of " + employee[i].getName() + " is " + employee[i].getSalary());
        }
    }
}

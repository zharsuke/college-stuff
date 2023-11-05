package com.azhar.exp;

public class Employee {
    private String name, nip, group;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public void setGroup(String group) {
        this.group = group;
        switch(group.charAt(0)) {
            case '1':
                this.salary = 5_000_000;
                break;
            case '2':
                this.salary = 3_000_000;
                break;
            case '3':
                this.salary = 2_000_000;
                break;
            case '4':
                this.salary = 1_000_000;
                break;
            case '5':
                this.salary = 750_000;
                break;
        }
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNip() {
        return nip;
    }

    public String getGroup() {
        return group;
    }

    public double getSalary() {
        return salary;
    }
}

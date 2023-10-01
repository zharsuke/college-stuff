package com.azhar.Exp2;

public class Driver {
    private String name;
    private int cost;

    public Driver() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int calculateCostDriver(int day) {
        return cost * day;
    }
}

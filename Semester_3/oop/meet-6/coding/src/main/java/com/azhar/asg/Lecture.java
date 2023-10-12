package com.azhar.asg;

public class Lecture extends Employee {
    private int amountSKS;
    private int ratesSKS;

    public Lecture() {
        super();
    }

    public void setAmountSKS(int amountSKS) {
        this.amountSKS = amountSKS;
    }

    public void setRatesSKS(int ratesSKS) {
        this.ratesSKS = ratesSKS;
    }

    public int getSalary() {
        return amountSKS * ratesSKS;
    }
    
}

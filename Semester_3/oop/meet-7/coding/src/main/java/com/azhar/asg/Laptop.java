package com.azhar.asg;

public class Laptop extends Computer {
    public String batteryType;

    public Laptop() {

    }

    public Laptop(String brand, String processorType, int memorySize, int processorSpeed, String batteryType) {
        super(brand, processorType, memorySize, processorSpeed);
        this.batteryType = batteryType;
    }

    public void printDataLaptop() {
        System.out.println("==========Data Laptop==========");
        super.printDataComputer();
        System.out.println("Battery Type = " + batteryType);
    }
}

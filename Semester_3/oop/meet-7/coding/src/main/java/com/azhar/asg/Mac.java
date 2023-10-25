package com.azhar.asg;

public class Mac extends Laptop {
    public String security;

    public Mac() {
        
    }

    public Mac(String brand, String processorType, int memorySize, int processorSpeed, String batteryType , String security) {
        super(brand, processorType, memorySize, processorSpeed, batteryType);
        this.security = security;
    }

    public void printDataMac() {
        System.out.println("==========Data Mac==========");
        super.printDataLaptop();
        System.out.println("Security = " + security);
    }
}

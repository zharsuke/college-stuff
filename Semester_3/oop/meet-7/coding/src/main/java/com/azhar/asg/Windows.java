package com.azhar.asg;

public class Windows extends Laptop {
    public String feature;

    public Windows() {
        
    }

    public Windows(String brand, String processorType, int memorySize, int processorSpeed, String batteryType , String feature) {
        super(brand, processorType, memorySize, processorSpeed, batteryType);
        this.feature = feature;
    }

    public void printDataWindows() {
        System.out.println("==========Data Windows==========");
        super.printDataLaptop();
        System.out.println("Feature = " + feature);
    }
}

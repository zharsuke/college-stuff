package com.azhar.asg;

public class Pc extends Computer {
    public int monitorSize;

    public Pc() {
        
    }

    public Pc(String brand, String processorType, int memorySize, int processorSpeed, int monitorSize) {
        super(brand, processorType, memorySize, processorSpeed);
        this.monitorSize = monitorSize;
    }

    public void printDataPc() {
        System.out.println("==========Data Pc==========");
        super.printDataComputer();
        System.out.println("Monitor Size = " + monitorSize);
    }
}

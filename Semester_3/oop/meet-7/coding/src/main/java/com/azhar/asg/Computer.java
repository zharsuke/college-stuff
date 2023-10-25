package com.azhar.asg;

public class Computer {
    public String brand, processorType;
    public int memorySize, processorSpeed;

    public Computer() {

    }

    public Computer(String brand, String processorType, int memorySize, int processorSpeed) {
        this.brand = brand;
        this.processorType = processorType;
        this.memorySize = memorySize;
        this.processorSpeed = processorSpeed;
    }

    public void printDataComputer() {
        System.out.println("Brand = " + brand);
        System.out.println("Processor Type = " + processorType);
        System.out.println("Memory Size = " + memorySize);
        System.out.println("Processor Speed = " + processorSpeed);
    }
}

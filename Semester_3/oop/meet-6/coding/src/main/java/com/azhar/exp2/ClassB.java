package com.azhar.exp2;

public class ClassB extends ClassA {
    private int z;

    public void setZ(int z) {
        this.z = z;
    }

    public void getGradeZ() {
        System.out.println("Grade z: " + z);
    }

    public void getAmount() {
        System.out.println("Amount: " + (getX()+getY()+z));
    }
}

package com.azhar.exp1;

public class ClassB extends ClassA {
    public int z;

    public void getGradeZ() {
        System.out.println("Grade z: " + z);
    }

    public void getAmount() {
        System.out.println("Amount: " + (x+y+z));
    }
}

package com.azhar.exp2;

public class ClassA {
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void getGrade() {
        System.out.println("Grade x: " + x);
        System.out.println("Grade y: " + y);
    }
}

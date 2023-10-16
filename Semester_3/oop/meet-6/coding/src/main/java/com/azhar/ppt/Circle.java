package com.azhar.ppt;

public class Circle extends FlatShape{
    private float r;

    public Circle() {
    }

    public Circle(float r) {
        this.r = r;
    }

    @Override
    public float area() {
        return (float) (Math.PI * r * r);
    }

    @Override
    public float circumference() {
        return 2 * (float) (Math.PI * r);
    }

    public void setR(float r) {
        this.r = r;
    }

    public float getR() {
        return r;
    }

}

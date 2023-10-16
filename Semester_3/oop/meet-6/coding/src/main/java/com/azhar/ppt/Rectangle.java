package com.azhar.ppt;

public class Rectangle extends FlatShape{
    private float length;
    private float width;

    public Rectangle() {
        
    }

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public float area() {
        return length * width;
    }

    @Override
    public float circumference() {
        return 2 * (length + width);
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getLength() {
        return length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getWidth() {
        return width;
    }
}

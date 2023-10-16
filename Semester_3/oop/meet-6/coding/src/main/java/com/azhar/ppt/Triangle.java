package com.azhar.ppt;

public class Triangle extends FlatShape {
    private float height;
    private float base;

    public Triangle() {
        
    }
    
    public Triangle(float height, float base) {
        this.height = height;
        this.base = base;
    }
    
    @Override
    public float area() {
        return (0.5f) * base * height;
    }
    
    @Override
    public float circumference() {
        return base + (height * 2f);
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }
}

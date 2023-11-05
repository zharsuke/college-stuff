package com.azhar.asg;

public class Triangle {
    private int angle;
    
    public int totalAngle(int angleA){
        this.angle = 180 - angleA;
        return angle;
    }
    
    public int totalAngle(int angleA, int angleB){
        this.angle = 180 - (angleA + angleB);
        return angle;
    }

    public int perimeter(int a, int b, int c){
        return a + b + c;
    }

    public double perimeter(int a, int b) {
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return a + b + c;
    }
}

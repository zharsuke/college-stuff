package com.azhar.ppt;

public class Main {
    public static void main(String[] args) {
        System.out.println("Rectangle");
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(10);
        rectangle.setWidth(20);
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.area());
        System.out.println("Circumference: " + rectangle.circumference()+ "\n");

        System.out.println("Circle");
        Circle circle = new Circle();
        circle.setR(10);
        System.out.println("Radius: " + circle.getR());
        System.out.println("Area: " + circle.area());
        System.out.println("Circumference: " + circle.circumference()+ "\n");

        System.out.println("Triangle");
        Triangle triangle = new Triangle();
        triangle.setHeight(10);
        triangle.setBase(20);
        System.out.println("Height: " + triangle.getHeight());
        System.out.println("Base: " + triangle.getBase());
        System.out.println("Area: " + triangle.area());
        System.out.println("Circumference: " + triangle.circumference()+ "\n");
    }
}

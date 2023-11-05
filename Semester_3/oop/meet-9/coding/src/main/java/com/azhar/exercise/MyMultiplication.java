package com.azhar.exercise;

public class MyMultiplication {
    void multiply(int a, int b) {
        System.out.println(a * b);
    }

    void multiply(double a, double b) {
        System.out.println(a * b);
    }

    public static void main(String[] args) {
        MyMultiplication myMultiplication = new MyMultiplication();
        myMultiplication.multiply(25, 43);
        myMultiplication.multiply(34.56, 23.7);
    }
}

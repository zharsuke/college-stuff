package com.azhar.exp3;

public class MainQuestion {
    public static void main(String[] args) {
        Employee machinist = new Employee("1234", "Spongebob Squarepants");
        Train train = new Train("Gaya Baru", "Bisnis", machinist);
        System.out.println(train.info());
    }
}

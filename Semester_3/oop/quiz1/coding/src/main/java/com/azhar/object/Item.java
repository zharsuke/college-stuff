package com.azhar.object;

public class Item {
    private String brand;
    private int amount;
    private double price;
    private String status;

    public Item() {

    }

    public Item(String brand, int amount, double price, String status) {
        this.brand = brand;
        this.amount = amount;
        this.price = price;
        this.status = status;
    }

    public String getBrand() {
        return brand;
    }

    public String getStatus() {
        return status;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addAmount(int amount) {
        this.amount += amount;
    }

    public void subAmount(int amount) {
        if (amount < 0) {
            System.out.println("Out of stock!");
        } else {
            this.amount -= amount;
        }
    }

    public void print() {
        System.out.println("Brand: " + brand);
        System.out.println("Amount: " + amount);
        System.out.println("Price: " + price);
        System.out.println("Status: " + status);
    }
}

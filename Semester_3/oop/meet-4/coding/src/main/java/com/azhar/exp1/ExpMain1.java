package com.azhar.exp1;

public class ExpMain1 {
    public static void main(String[] args) {
        Processor p = new Processor("Intel i5", 3);
        Laptop l = new Laptop("Thinkpad", p);
        l.info();

        Processor p1 = new Processor();
        p1.setBrand("Intel i5");
        p1.setCache(4);
        Laptop l1 = new Laptop();
        l1.setBrand("Thinkpad");
        l1.setProcessor(p1);
        l1.info();
    }
}

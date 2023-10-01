package com.azhar.Exp2;

public class ExpMain2 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("Avanza");
        car.setCost(350_000);
        Driver driver = new Driver();
        driver.setName("Azhar");
        driver.setCost(200_000);
        Customer customer = new Customer();
        customer.setName("Rizqi");
        customer.setCar(car);
        customer.setDriver(driver);
        customer.setDay(2);
        System.out.println("Total cost : " + customer.calculateCostTotal());
    }
}

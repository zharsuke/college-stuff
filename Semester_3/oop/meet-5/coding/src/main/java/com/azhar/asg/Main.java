package com.azhar.asg;

public class Main {
    public static void main(String[] args) {
        ListSalary listSalary = new ListSalary(2);
        Lecture lecture1 = new Lecture();
        lecture1.setNip("1234");
        lecture1.setName("Azhar");
        lecture1.setAddress("Jl. Sukarno Hatta No.9");
        lecture1.setAmountSKS(5);
        lecture1.setRatesSKS(100_000);

        Lecture lecture2 = new Lecture();
        lecture2.setNip("5678");
        lecture2.setName("Rizqi");
        lecture2.setAddress("Jl. Sukarno Hatta No.9");
        lecture2.setAmountSKS(10);
        lecture2.setRatesSKS(150_000);
        
        listSalary.addEmployee(lecture1);
        listSalary.addEmployee(lecture2);

        listSalary.printAllSalary();
        
    }
}

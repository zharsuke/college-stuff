package com.azhar.exp1;

public class Main {
    public static void main(String[] args) {
        // Manager m = new Manager();
        // m.name = "Azhar";
        // m.address = "Jl. Sukarno Hatta no.9";
        // m.age = 20;
        // m.gender = "Male";
        // m.salary = 100_000_000;
        // m.printDataManager();

        // Staff s = new Staff();
        // s.name = "Rizqi";
        // s.address = "Jl. Jendral Sudirman";
        // s.age = 20;
        // s.gender = "Male";
        // s.salary = 50_000_000;
        // s.overtime = 500_000;
        // s.deduction = 250_000;
        // s.printDataStaff();

        FixedStaff fs = new FixedStaff("Rizqi", "Jl. Jendral Sudirman", "Male", 20, 50_000_000, 500_000, 250_000, "IT", 100_000);
        fs.printDataFixedStaff();

        DailyStaff ds = new DailyStaff("Rizqi", "Jl. Jendral Sudirman", "Male", 20, 50_000_000, 500_000, 250_000, 8);
        ds.printDataDailyStaff();
    }
}

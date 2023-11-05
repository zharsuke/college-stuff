package com.azhar.exp;

public class Main {
    public static void main(String[] args) {
        System.out.println("Manager & Staff Testing Program");
        Manager[] managers = new Manager[2];
        Staff [] staffs1 = new Staff[2];
        Staff [] staffs2 = new Staff[3];

        managers[0] = new Manager();
        managers[0].setName("John");
        managers[0].setNip("123");
        managers[0].setGroup("1");
        managers[0].setAllowance(5_000_000);
        managers[0].setSection("Administration");

        managers[1] = new Manager();
        managers[1].setName("Jane");
        managers[1].setNip("456");
        managers[1].setGroup("1");
        managers[1].setAllowance(2_500_000);
        managers[1].setSection("Marketing");

        staffs1[0] = new Staff();
        staffs1[0].setName("Sarah");
        staffs1[0].setNip("789");
        staffs1[0].setGroup("2");
        staffs1[0].setOverTime(10);
        staffs1[0].setOverTimeSalary(10_000);

        staffs1[1] = new Staff();
        staffs1[1].setName("Alex");
        staffs1[1].setNip("321");
        staffs1[1].setGroup("2");
        staffs1[1].setOverTime(10);
        staffs1[1].setOverTimeSalary(55_000);

        staffs2[0] = new Staff();
        staffs2[0].setName("Alex");
        staffs2[0].setNip("321");
        staffs2[0].setGroup("3");
        staffs2[0].setOverTime(15);
        staffs2[0].setOverTimeSalary(5_500);

        staffs2[1] = new Staff();
        staffs2[1].setName("Alex");
        staffs2[1].setNip("321");
        staffs2[1].setGroup("4");
        staffs2[1].setOverTime(5);
        staffs2[1].setOverTimeSalary(100_000);

        staffs2[2] = new Staff();
        staffs2[2].setName("Alex");
        staffs2[2].setNip("321");
        staffs2[2].setGroup("3");
        staffs2[2].setOverTime(6);
        staffs2[2].setOverTimeSalary(20_000);

        managers[1].setStaff(staffs2);

        managers[0].print();
        managers[1].print();
    }
}

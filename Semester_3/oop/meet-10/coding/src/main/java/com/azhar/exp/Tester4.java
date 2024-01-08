package com.azhar.exp;

public class Tester4 {
    public static void main(String[] args) {
        Owner ow = new Owner();
        ElectriccityBill eBill = new ElectriccityBill(5, "R-1");
        ow.pay(eBill);
        System.out.println("--------------------------");

        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        ow.pay(pEmp);
        System.out.println("--------------------------");

        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        ow.showMyEmployee(iEmp);
        System.out.println("--------------------------");
        ow.showMyEmployee(iEmp);
    }
}

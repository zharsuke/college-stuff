package com.azhar.exp;

public class Tester3 {
    public static void main(String[] args) {
        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
        ElectriccityBill eBill = new ElectriccityBill(5, "A-1");
        Employee e [] = {pEmp, iEmp};
        Payable p [] = {pEmp, eBill};
        // Employee e2 [] = {pEmp, iEmp, eBill};
    }
}

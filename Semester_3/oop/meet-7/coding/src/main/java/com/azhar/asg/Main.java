package com.azhar.asg;

public class Main {
    public static void main(String[] args) {
        Pc pc = new Pc("Lenovo", "Intel", 8, 150, 15);
        pc.printDataPc();

        Mac mac = new Mac("Apple", "Intel", 8, 150, "Li-ion", "Secured");
        mac.printDataMac();

        Windows windows = new Windows("Dell", "Intel", 8, 150, "Li-ion", "There is dedicated vga card");
        windows.printDataWindows();
    }
}

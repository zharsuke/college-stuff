package com.azhar.object;

public class Main {
    public static void main(String[] args) {
        PC pc1 = new PC();
        pc1.setBrand("Lenovo");
        pc1.setAmount(10);
        pc1.setPrice(1000);
        pc1.setStatus("Available");
        pc1.setCpu("i7");
        pc1.setRam(8);
        pc1.setStorage(500);
        pc1.printPC();

        System.out.println();

        Monitor monitor1 = new Monitor();
        monitor1.setBrand("Samsung");
        monitor1.setAmount(10);
        monitor1.setPrice(1000);
        monitor1.setStatus("Available");
        monitor1.setResolution("4K");
        monitor1.setScreenSize(27);
        monitor1.printMonitor();

        System.out.println();

        Keyboard keyboard1 = new Keyboard();
        keyboard1.setBrand("Apple");
        keyboard1.setAmount(10);
        keyboard1.setPrice(1000);
        keyboard1.setStatus("Available");
        keyboard1.setLayout(60);
        keyboard1.printKeyboard();

        System.out.println();

        Mouse mouse1 = new Mouse();
        mouse1.setBrand("Logitech");
        mouse1.setAmount(10);
        mouse1.setPrice(1000);
        mouse1.setStatus("Available");
        mouse1.setType("Wireless");
        mouse1.printMouse();
    }
}

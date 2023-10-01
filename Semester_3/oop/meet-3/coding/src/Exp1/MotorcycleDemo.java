package Exp1;

public class MotorcycleDemo {
    public static void main(String[] args) {
        Motorcycle motorcycle1 = new Motorcycle();
        motorcycle1.printStatus();
        motorcycle1.addSpeed();

        motorcycle1.engineOn();
        motorcycle1.printStatus();

        motorcycle1.addSpeed();
        motorcycle1.printStatus();
        
        motorcycle1.addSpeed();
        motorcycle1.printStatus();
        
        motorcycle1.addSpeed();
        motorcycle1.printStatus();

        motorcycle1.engineOff();
        motorcycle1.printStatus();
    }
}

package Exp1;

public class Motorcycle {
    private int speed = 0;
    private boolean contactOn = false;

    public void engineOn() {
        contactOn = true;
    }

    public void engineOff() {
        contactOn = false;
        speed = 0;
    }

    public void addSpeed() {
        if (contactOn == true) {
            if (speed > 100) {
                System.out.println("Speed can't increase!");
            } else {
                speed += 5;
            }
        } else {
            System.out.println("Speed can't increase because the engine is off!");
        }
    }

    public void subtractSpeed() {
        if (contactOn == true) {
            speed -= 5;
        } else {
            System.out.println("Speed can't decrease because the engine is off!");
        }
    }

    public void printStatus() {
        if (contactOn == true) {
            System.out.println("Contact on");
        } else {
            System.out.println("Contact off");
        }
        System.out.println("Speed: " + speed);
    }
}

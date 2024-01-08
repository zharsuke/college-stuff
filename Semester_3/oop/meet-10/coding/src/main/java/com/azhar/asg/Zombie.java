package com.azhar.asg;

public class Zombie implements Destroyable {
    protected int health;
    protected int level;

    public void heal() {
        if (this.level == 1) {
            this.health += this.health * 0.1;
        } else if (this.level == 2) {
            this.health += this.health * 0.3;
        } else if (this.level == 3) {
            this.health += this.health * 0.4;
        }
    }

    public void destroyed() {
        this.health -= this.health * 0.2;
    }

    public String getZombieInfo() {
        return "\nHealth = " + this.health + "\nLevel = " + this.level;
    }

}

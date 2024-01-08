package com.azhar.asg;

public class WalkingZombie extends Zombie {
    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

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
        this.health -= this.health * 0.19;
    }

    public String getZombieInfo() {
        return "\nWalking Zombie Data = " + super.getZombieInfo();
    }

    
}

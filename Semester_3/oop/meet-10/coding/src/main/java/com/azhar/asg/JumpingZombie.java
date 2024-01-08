package com.azhar.asg;

public class JumpingZombie extends Zombie {
    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public void heal() {
        if (this.level == 1) {
            this.health += this.health * 0.1;
        } else if (this.level == 2) {
            this.health += this.health * 0.4;
        } else if (this.level == 3) {
            this.health += this.health * 0.5;
        }
    }

    public void destroyed() {
        this.health -= this.health * 0.095;
    }

    public String getZombieInfo() {
        return "\nJumping Zombie Data = " + super.getZombieInfo();
    }

}

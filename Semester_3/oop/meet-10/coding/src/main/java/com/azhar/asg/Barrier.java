package com.azhar.asg;

public class Barrier implements Destroyable {
    private int health;

    public Barrier(int strength) {
        this.health = strength;
    }

    public void setStrength(int strength) {
        this.health = strength;
    }

    public int getStrength() {
        return this.health;
    }

    public void destroyed() {
        this.health -= this.health * 0.1;
    }

    public String getBarrierInfo() {
        return "\nBarrier Strength = " + this.health + "\n";
    }
}

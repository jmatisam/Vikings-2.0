package org.example.soldier;

public class Soldier {

    private  int strength;
    protected  int health;

    public Soldier (int health, int strength) {
        this.strength= strength;
        this.health = health;

    }

    public int attack() {
        return strength;
    }

    public void receiveDamage(int damage) {
      health =  health -  damage;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }





}

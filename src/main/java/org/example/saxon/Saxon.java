package org.example.saxon;

import org.example.soldier.Soldier;

public class Saxon extends Soldier {

    private String msg;

    public Saxon (int health, int strength) {
        super(health, strength);
        this.msg = ""; //atributos no heredados
    }

    //Este método necesita ser **reimplementado** para `Viking` porque la versión  `Viking` devuelve valores diferentes.)
    @Override //Anotación @Override:se utiliza para indicar que el método receiveDamage en Viking está sobrescribiendo un método en la clase base (Soldier).
    public void receiveDamage(int damage) {
        super.receiveDamage(damage);//super permite llamar al método de la clase base Padre (Soldier) 
        if (this.getHealth() > 0) {
            msg = "A Saxon has received " + damage + " points of damage";
        } else {
            msg = "A Saxon has died in combat";
        }
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "A Saxon = "  + ", attack = " + attack() + ", Strength = " + getStrength()
                + ", Health = " + getHealth() + ".";
    }

}

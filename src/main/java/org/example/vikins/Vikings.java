package org.example.vikins;

import org.example.soldier.Soldier;

public class Vikings extends Soldier {

    private String name;
    private String msg;
    
    public Vikings (int health, int strength, String name) {
        super(health, strength);
        this.name = name; //atributos no heredados
        this.msg = "";  //atributos no heredados
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Este método necesita ser **reimplementado** para `Viking` porque la versión  `Viking` devuelve valores diferentes.)
    @Override //Anotación @Override:se utiliza para indicar que el método receiveDamage en Viking está sobrescribiendo un método en la clase base (Soldier).
    public void receiveDamage(int damage) {
        super.receiveDamage(damage);//super permite llamar al método de la clase base Padre (Soldier) 
        if (this.getHealth() > 0) {
            msg = name + " has received " + damage + " points of damage";
        } else {
            msg = name + " has died in act of combat";
        }
    }

    public String getMsg() {
        return msg;
    }
    
    public String battleCry(){
        return "Odin Owns You All!";
    }

    @Override
    public String toString() {
        return "Vikings Name = " + name + ", attack = " + attack() + ", Strength = " + getStrength()
                + ", Health = " + getHealth() + ".";
    }

}

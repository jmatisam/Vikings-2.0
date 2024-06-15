package org.example.war;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.example.saxon.Saxon;
import org.example.vikins.Vikings;

public class War {

    private List<Vikings> vikingArmy;
    private List<Saxon> saxonArmy;

    
    public War() {
        vikingArmy = new ArrayList<>();
        saxonArmy = new ArrayList<>();
    }

    public List<Vikings> getVikingArmy() {
        return vikingArmy;
    }

    public void setVikingArmy(List<Vikings> vikingArmy) {
        this.vikingArmy = vikingArmy;
    }

    public List<Saxon> getSaxonArmy() {
        return saxonArmy;
    }

    public void setSaxonArmy(List<Saxon> saxonArmy) {
        this.saxonArmy = saxonArmy;
    }

    public void addViking(Vikings viking) {
        vikingArmy.add(viking);
    }


    public void addSaxon(Saxon saxon) {
        saxonArmy.add(saxon);
    }

    public String vikingAttack() {
        if (saxonArmy.isEmpty()) {
            return "No Saxon Alive.";
        }else {
        Random random = new Random();
        int vikingIndexAttack = random.nextInt(vikingArmy.size());
        int saxonIndexDef = random.nextInt(saxonArmy.size());

        Vikings attackingViking = vikingArmy.get(vikingIndexAttack);
        Saxon defendingSaxon = saxonArmy.get(saxonIndexDef);

        int damage = attackingViking.attack();
        defendingSaxon.receiveDamage(damage);

        String result = defendingSaxon.getMsg();

        if (defendingSaxon.getHealth() <= 0) {
            saxonArmy.remove(defendingSaxon);
        }

            return result;
        }  
       
    }
    
    public String saxonAttack() {
        if (vikingArmy.isEmpty()) {
            return "No Vikings Alive, All are going to Valhalla.";
        } else {
            Random random = new Random();
            int vikingIndexDef = random.nextInt(vikingArmy.size());
            int saxonIndexAttack = random.nextInt(saxonArmy.size());

            Saxon attackingSaxon = saxonArmy.get(saxonIndexAttack);
            Vikings defendingViking = vikingArmy.get(vikingIndexDef);

            int damage = attackingSaxon.attack();
            defendingViking.receiveDamage(damage);

            String result = defendingViking.getMsg();

            if (defendingViking.getHealth() <= 0) {
                vikingArmy.remove(defendingViking);
            }
    
            return result;
        }
    }
    
    
    public String showStatus() {
       
        if (saxonArmy.isEmpty()) {
            return "¡Vikings have won the war of the century!";
        
        } else if (vikingArmy.isEmpty()) {
            return "Saxons have fought for their lives and survive another day...";
            
        } else {
            return "Vikings and Saxons are still in the thick of battle.";
        }
    }

    
}

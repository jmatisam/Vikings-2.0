package org.example.saxon;

import org.example.soldier.Soldier;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

class SaxonTest {
    int health = 60;
    int strength = 25;

    Saxon saxon = new Saxon(health, strength);

@Test
public void should_inherit_from_Soldier() {
    assertNotNull(saxon instanceof Soldier);
}

@Test
public void should_receive_2_arguments() {
    assertNotNull(saxon);
}

@Test
public void should_receive_the_health_property_as_its_1st_argument() {
    assertEquals(60, saxon.getHealth());
}

@Test
public void should_receive_the_health_property_as_its_2st_argument() {
    
    assertEquals(25, saxon.getStrength());
}

@Test
public void attack_should_return_strength_property_of_the_Saxon() {
    var resultAttack = saxon.attack();
    assertEquals(saxon.getStrength(), resultAttack);
}

@Test
public void attack_should_receive_0_arguments() {
    //int damage = 50;
    int resultAttack = saxon.attack();
    assertEquals(this.strength, resultAttack);
}

@Test
public void damage_should_receive_1_arguments() {
    saxon.receiveDamage(50);
    assertEquals(10, saxon.getHealth());
}

@Test
public void should_remove_the_received_damage_from_the_health_property() {
    saxon.receiveDamage(50);
    assertEquals(10, saxon.getHealth());
}

@Test
public void should_return_A_Saxon_has_received_DAMAGE_points_of_damage_if_the_Saxon_is_still_alive() {
    saxon.receiveDamage(45);
    assertEquals("A Saxon has received " + 45 + " points of damage", saxon.getMsg());
}

@Test
public void should_return_A_Saxon_has_died_in_combat_if_the_Saxon_dies() {
    saxon.receiveDamage(health);
    assertEquals("A Saxon has died in combat", saxon.getMsg());

}
}
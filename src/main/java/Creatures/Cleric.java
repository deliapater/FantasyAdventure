package Creatures;

import Tools.HealingTools;
import Tools.WeaponsSpells;

public class Cleric implements IDamage{

private String name;
private int healthPoints;
private HealingTools healingTools;
Warrior warrior;



public Cleric(String name, int healthPoints, HealingTools healingTools){
    this.name = name;
    this.healthPoints = healthPoints;
    this.healingTools = healingTools;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public HealingTools getHealingTools() {
        return healingTools;
    }

    public void setHealingTools(HealingTools healingTools) {
        this.healingTools = healingTools;
    }
    public int damage(int damage){
        return this.healthPoints -= damage;
    }

    public void healing(HealingTools tool, Warrior warrior) {
        int healthPoints = warrior.getHealthPoints();

        warrior.setHealthPoints(healthPoints += this.healingTools.getHealingPoints());

}
}


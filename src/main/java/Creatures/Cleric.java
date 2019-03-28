package Creatures;

import Tools.Gems;
import Tools.HealingTools;

import java.util.ArrayList;

public class Cleric implements IDamage{

private String name;
private int healthPoints;
private HealingTools healingTools;
private ArrayList<Gems> gems;
Warrior warrior;




public Cleric(String name, int healthPoints, HealingTools healingTools){
    this.name = name;
    this.healthPoints = healthPoints;
    this.healingTools = healingTools;
    this.gems = new ArrayList<Gems>();
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

    public Warrior getWarrior() {
        return warrior;
    }

    public void setWarrior(Warrior warrior) {
        this.warrior = warrior;
    }

    public ArrayList<Gems> getGems() {
        return gems;
    }


    public void addGems(Gems gem){
        this.gems.add(gem);
    }

    public int countGems(){
        return this.gems.size();
    }

}


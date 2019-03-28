package Creatures;

import Tools.WeaponsSpells;

public abstract class Creature implements IDamage {
    private String type;
    private int healthPoints;
    private WeaponsSpells weaponsSpells;

    public Creature(String type, int healthPoints, WeaponsSpells weaponsSpells){
        this.type = type;
        this.healthPoints = healthPoints;
        this.weaponsSpells = weaponsSpells;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public WeaponsSpells getWeaponsSpells() {
        return weaponsSpells;
    }

    public void setWeaponsSpells(WeaponsSpells weaponsSpells) {
        this.weaponsSpells = weaponsSpells;
    }

    public int damage(int damage){
        return this.healthPoints -= damage;
    }


}

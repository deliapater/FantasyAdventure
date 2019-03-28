package Creatures;

import Tools.Gems;
import Tools.WeaponsSpells;

import java.util.ArrayList;

public abstract class Creature implements IDamage {
    private String type;
    private int healthPoints;
    private WeaponsSpells weaponsSpells;
    private ArrayList<Gems> gems;

    public Creature(String type, int healthPoints, WeaponsSpells weaponsSpells){
        this.type = type;
        this.healthPoints = healthPoints;
        this.weaponsSpells = weaponsSpells;
        this.gems = new ArrayList<Gems>();
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

    public ArrayList<Gems> getGems() {
        return gems;
    }

    public void setGems(ArrayList<Gems> gems) {
        this.gems = gems;
    }

    public void addGems(Gems gem){
        this.gems.add(gem);
    }

    public int countGems(){
        return this.gems.size();
    }
}

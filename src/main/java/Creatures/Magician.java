package Creatures;

import Tools.WeaponsSpells;

public class Magician extends Creature implements IDamage{
    private String name;
    private String mythicalCreatureName;
    private int mythicalCreatureBonus;

    public Magician(String type, int healthPoints, WeaponsSpells weaponsSpells,String name, String mythicalCreatureName, int mythicalCreatureBonus) {
        super(type, healthPoints, weaponsSpells);
        this.name = name;
        this.mythicalCreatureName = mythicalCreatureName;
        this.mythicalCreatureBonus = mythicalCreatureBonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMythicalCreatureName() {
        return mythicalCreatureName;
    }

    public void setMythicalCreatureName(String mythicalCreature) {
        this.mythicalCreatureName = mythicalCreature;
    }

    public int getMythicalCreatureBonus() {
        return mythicalCreatureBonus;
    }

    public void setMythicalCreatureBonus(int mythicalCreatureBonus) {
        this.mythicalCreatureBonus = mythicalCreatureBonus;
    }
}

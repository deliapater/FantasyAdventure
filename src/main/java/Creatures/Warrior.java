package Creatures;

import Tools.WeaponsSpells;

public class Warrior extends Creature{

    private String name;
    private int armour;

    public Warrior(String type, int healthPoints, WeaponsSpells weaponsSpells, String name, int armour) {
        super(type, healthPoints, weaponsSpells);
        this.name = name;
        this.armour = armour;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArmour() {
        return armour;
    }

    public void setArmour(int armour) {
        this.armour = armour;
    }
}

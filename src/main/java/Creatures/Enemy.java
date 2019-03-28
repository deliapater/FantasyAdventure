package Creatures;

import Tools.WeaponsSpells;

public class Enemy extends Creature implements IDamage {
    public Enemy(String type, int healthPoints, WeaponsSpells weaponsSpells) {
        super(type, healthPoints, weaponsSpells);
    }
}

import Creatures.Cleric;
import Creatures.Warrior;
import Tools.Gems;
import Tools.HealingTools;
import Tools.WeaponsSpells;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    Warrior warrior;
    Gems gems;

    @Before
    public void setUp() {
        cleric = new Cleric("Cleric", 100, HealingTools.POTION);
        warrior = new Warrior("Weapon", 100, WeaponsSpells.AXE, "Dwarf", 2);

    }

    @Test
    public void hasName() {
        assertEquals("Cleric", cleric.getName());
    }

    @Test
    public void hasHealthPoints() {
        assertEquals(100, cleric.getHealthPoints());
    }

    @Test
    public void hasHealingTools() {
        assertEquals(HealingTools.POTION, cleric.getHealingTools());
    }

    @Test
    public void canSetName() {
        cleric.setName("Medic");
        assertEquals("Medic", cleric.getName());
    }

    @Test
    public void canSetHealthPoints() {
        cleric.setHealthPoints(150);
        assertEquals(150, cleric.getHealthPoints());
    }

    @Test
    public void canSetHealingTools() {
        cleric.setHealingTools(HealingTools.BALM);
        assertEquals(HealingTools.BALM, cleric.getHealingTools());

    }

    @Test
    public void canRecieveDamage() {
        cleric.damage(20);
        assertEquals(80, cleric.getHealthPoints());
    }

    @Test
    public void canHealOtherPlayer() {
        cleric.healing(HealingTools.POTION, warrior);
        assertEquals(105, warrior.getHealthPoints());

    }

    @Test
    public void hasGems(){
        cleric.addGems(Gems.DIAMOND);
        assertEquals(1, cleric.countGems());
    }
}

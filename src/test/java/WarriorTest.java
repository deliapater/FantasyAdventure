import Creatures.Creature;
import Creatures.Warrior;
import Tools.Gems;
import Tools.WeaponsSpells;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class WarriorTest {

        public Creature creature;
        public WeaponsSpells weaponsSpells;
        public Warrior warrior;

        @Before
        public void setUp() {

            warrior = new Warrior("Weapon", 100, WeaponsSpells.AXE, "Dwarf", 2);

        }
        @Test
        public void hasType() {
            assertEquals("Weapon", warrior.getType());
        }

        @Test
        public void canSetType() {
                warrior.setType("Spell");
                assertEquals("Spell", warrior.getType());
        }

        @Test
        public void hasHealthPoints() {
                assertEquals(100, warrior.getHealthPoints());
        }


        @Test
        public void canSetHealthPoints() {
                warrior.setHealthPoints(200);
                assertEquals(200, warrior.getHealthPoints());
        }

        @Test
        public void canHaveDamage(){
                warrior.damage(20);
                assertEquals(80, warrior.getHealthPoints());
        }

        @Test
        public void hasWeaponsSpells() {
                assertEquals(WeaponsSpells.AXE, warrior.getWeaponsSpells());
        }

        @Test
        public void canSetWeaponsSpells() {
                warrior.setWeaponsSpells(WeaponsSpells.SWORD);
                assertEquals(WeaponsSpells.SWORD, warrior.getWeaponsSpells()
                );
        }

        @Test
        public void hasName() {
                assertEquals("Dwarf", warrior.getName());

        }

        @Test
        public void canSetName() {
                warrior.setName("Knight");
                assertEquals("Knight", warrior.getName());
        }

        @Test
        public void hasArmour() {
                assertEquals(2, warrior.getArmour());
        }

        @Test
        public void canSetArmour() {
                warrior.setArmour(150);
                assertEquals(150, warrior.getArmour());
        }

        @Test
        public void hasGems(){
                warrior.addGems(Gems.DIAMOND);
                assertEquals(1, warrior.countGems());
        }
    }




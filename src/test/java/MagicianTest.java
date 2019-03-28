import Creatures.Creature;
import Creatures.Magician;
import Tools.WeaponsSpells;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MagicianTest {


        public Creature creature;
        public WeaponsSpells weaponsSpells;
        public Magician magician;

        @Before
        public void setUp() {

            magician = new Magician("Spell", 100, WeaponsSpells.FIREBALL, "Wizard","Dragon", 2);

        }
        @Test
        public void hasType() {
            assertEquals("Spell", magician.getType());
        }

        @Test
        public void canSetType() {
            magician.setType("Weapon");
            assertEquals("Weapon", magician.getType());
        }

        @Test
        public void hasHealthPoints() {
            assertEquals(100, magician.getHealthPoints());
        }


        @Test
        public void canSetHealthPoints() {
            magician.setHealthPoints(200);
            assertEquals(200, magician.getHealthPoints());
        }

        @Test
        public void canHaveDamage(){
            magician.damage(20);
            assertEquals(80, magician.getHealthPoints());
        }

        @Test
        public void hasWeaponsSpells() {
            assertEquals(WeaponsSpells.FIREBALL, magician.getWeaponsSpells());
        }

        @Test
        public void canSetWeaponsSpells() {
            magician.setWeaponsSpells(WeaponsSpells.ICEBLAST);
            assertEquals(WeaponsSpells.ICEBLAST, magician.getWeaponsSpells()
            );
        }

        @Test
        public void hasName() {
            assertEquals("Wizard", magician.getName());

        }

        @Test
        public void canSetName() {
            magician.setName("Warlock");
            assertEquals("Warlock", magician.getName());
        }

        @Test
        public void hasMythicalCreatureName() {
            assertEquals("Dragon", magician.getMythicalCreatureName());
        }

        @Test
        public void canSetMythicalCreatureName() {
            magician.setMythicalCreatureName("Ogre");
            assertEquals("Ogre", magician.getMythicalCreatureName());
        }

    @Test
    public void hasMythicalCreatureBonus() {
            assertEquals(2, magician.getMythicalCreatureBonus());
    }

    @Test
    public void canSetMythicalCreatureBonus() {
            magician.setMythicalCreatureBonus(5);
            assertEquals(5, magician.getMythicalCreatureBonus());


    }
}







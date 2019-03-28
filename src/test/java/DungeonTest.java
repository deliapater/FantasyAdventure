import Creatures.Creature;
import Creatures.Enemy;
import Rooms.Dungeon;
import Tools.Gems;
import Tools.WeaponsSpells;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DungeonTest {


    private Creature creature;
    private Dungeon dungeon;
    private Enemy enemy;

    Gems gems;

    @Before
    public void setup() {
        dungeon = new Dungeon("Dungeon", Gems.DIAMOND, enemy);
        enemy = new Enemy("Vampire", 100, WeaponsSpells.SWORD);
    }

    @Test
    public void canRemoveGems() {
        dungeon.setGems(0);
        assertEquals(0, dungeon.getGems());
    }
}







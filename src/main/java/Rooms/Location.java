package Rooms;

import Creatures.Creature;
import Tools.Gems;

import java.util.ArrayList;

public abstract class Location {


    private String name;
    private Gems gems;
    private Creature enemy;

public Location(String name, Gems gems, Creature enemy){
    this.name = name;
    this.gems = gems;
    this.enemy = enemy;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gems getGems() {
        return gems;
    }

    public void setGems(Gems gems) {
        this.gems = gems;
    }

    public Creature getEnemy() {
        return enemy;
    }

    public void setEnemy(Creature enemy) {
        this.enemy = enemy;
    }
}

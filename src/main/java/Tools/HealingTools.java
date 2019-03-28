package Tools;

public enum HealingTools {

    POTION(5),
    HERBS(8),
    BALM(5);

    private final int healingPoints;

    HealingTools(int healingPoints){
        this.healingPoints = healingPoints;
    }

    public int getHealingPoints() {
        return healingPoints;
    }
}

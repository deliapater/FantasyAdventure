package Tools;

public enum healingTools {

    POTION(5),
    HERBS(8),
    BALM(5);

    private final int healingPoints;

    healingTools(int healingPoints){
        this.healingPoints = healingPoints;
    }
}

package Tools;

public enum WeaponsSpells {
    SWORD("weapon", 10),
    AXE("weapon", 15),
    CLUB("weapon", 8),
    BOW("weapon", 10),
    FIREBALL("spell", 20),
    LIGHTINGSTRIKE("spell", 15),
    ICEBLAST("spell", 12);

    private final String type;
    private final int damagePoints;

    WeaponsSpells(String type, int damagePoints){
        this.type = type;
        this.damagePoints = damagePoints;
    }
}

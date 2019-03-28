public enum WeaponsSpells {
    SWORD("weapon", 10),
    AXE("weapon", 15),
    CLUB("weapon", 8),
    BOW("weapon", 10),
    Fireball("spell", 20),
    LightingStrike("spell", 15),
    IceBlast("spell", 12);

    private final String type;
    private final int damagePoints;

    WeaponsSpells(String type, int damagePoints){
        this.type = type;
        this.damagePoints = damagePoints;
    }
}

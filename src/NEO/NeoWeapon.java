package NEO;

public class NeoWeapon {

    private int minDamage;
    private int maxDamage;


    public NeoWeapon(int minDamage, int maxDamage) {
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    public int getRollWeaponDamage() {
        return NeoRandom.rollDice(minDamage, maxDamage);
    }
}

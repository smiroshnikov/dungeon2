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

    public enum Weapons {
        TWOHANDEDAXE("Lightning Axe", WeaponType.ARMS, 1, 12),
        BARBED_WHIP("Barbed Whip ", WeaponType.EXOTIC, 1, 4),
        SHARPCLAWS("Fetid Claws ", WeaponType.NATURAL, 1, 2);

        private final String weaponName;
        private final WeaponType weaponType;
        private final int baseDamageMin;
        private final int baseDamageMax;

        Weapons(String weaponName, WeaponType weaponType, int baseDamageMin, int baseDamageMax) {
            this.weaponName = weaponName;
            this.weaponType = weaponType;
            this.baseDamageMin = baseDamageMin;
            this.baseDamageMax = baseDamageMax;
        }

        public enum WeaponType {
            ARMS,
            NATURAL,
            EXOTIC
        }

    }
}

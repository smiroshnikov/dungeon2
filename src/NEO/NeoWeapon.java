package NEO;

public class NeoWeapon {

    private Weapons equippedWeapon;


    public NeoWeapon(Weapons equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
    }

    public int getRollWeaponDamage() {
        return NeoRandom.rollDice(equippedWeapon.baseDamageMin, equippedWeapon.baseDamageMax);
    }

    @Override
    public String toString() {
        return equippedWeapon.weaponType + " weapon " + equippedWeapon.weaponName;

    }

    public enum Weapons {
        TWOHANDEDAXE("Lightning Axe", WeaponType.MARTIAL, 1, 12),
        BASTARD_SWORD("Bastard Sword", WeaponType.MARTIAL, 2, 10),
        FIRE_SPEAR("Fire Spear", WeaponType.MARTIAL, 2, 8),

        BARBED_WHIP("Barbed Whip ", WeaponType.EXOTIC, 1, 4),
        FLAMBERGE("FLAMBERGE", WeaponType.EXOTIC, 4, 16),

        FETIDCLAWS("Fetid Claws", WeaponType.NATURAL, 1, 2),
        SHARPTEETH("Sharp Teeth", WeaponType.NATURAL, 1, 2);

        // enum fields

        private final String weaponName;
        private final WeaponType weaponType;
        private final int baseDamageMin;
        private final int baseDamageMax;

        // enum fields

        Weapons(String weaponName, WeaponType weaponType,
                int baseDamageMin, int baseDamageMax) {
            // enum constructor
            this.weaponName = weaponName;
            this.weaponType = weaponType;
            this.baseDamageMin = baseDamageMin;
            this.baseDamageMax = baseDamageMax;
        }

        private enum WeaponType {
            MARTIAL,
            NATURAL,
            EXOTIC
        }

    }
}

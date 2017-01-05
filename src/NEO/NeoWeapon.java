package NEO;

public class NeoWeapon {

    private WeaponsCollectionByType equippedWeapon;


    public NeoWeapon(WeaponsCollectionByType equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
    }


    public int getRollWeaponDamage() {
        return NeoRandom.rollDice(equippedWeapon.baseDamageMin, equippedWeapon.baseDamageMax);
    }

    @Override
    public String toString() {
        return equippedWeapon.weaponGroups + " weapon " + equippedWeapon.weaponName;

    }

    public enum WeaponsCollectionByType {
        TWOHANDEDAXE("Lightning Axe", WeaponGroups.MARTIAL, 1, 12),
        BASTARD_SWORD("Bastard Sword", WeaponGroups.MARTIAL, 2, 10),
        FIRE_SPEAR("Fire Spear", WeaponGroups.MARTIAL, 2, 8),

        BARBED_WHIP("Barbed Whip ", WeaponGroups.EXOTIC, 1, 4),
        FLAMBERGE("FLAMBERGE", WeaponGroups.EXOTIC, 4, 16),

        FETIDCLAWS("Fetid Claws", WeaponGroups.NATURAL, 1, 2),
        SHARPTEETH("Sharp Teeth", WeaponGroups.NATURAL, 1, 2),

        ICE_BREATH("Ice Breath", WeaponGroups.CASTER, 6, 12);

        // enum fields

        private final String weaponName;
        private final WeaponGroups weaponGroups;
        private final int baseDamageMin;
        private final int baseDamageMax;

        // enum fields

        WeaponsCollectionByType(String weaponName, WeaponGroups weaponGroups,
                                int baseDamageMin, int baseDamageMax) {
            // enum constructor
            this.weaponName = weaponName;
            this.weaponGroups = weaponGroups;
            this.baseDamageMin = baseDamageMin;
            this.baseDamageMax = baseDamageMax;
        }

        public enum WeaponGroups {
            //        private enum WeaponGroups {
            MARTIAL,
            NATURAL,
            EXOTIC,
            CASTER
        }

    }
}

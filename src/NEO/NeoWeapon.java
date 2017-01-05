package NEO;

import java.util.ArrayList;

public class NeoWeapon {

    private WeaponsCollectionByType equippedWeapon;


    public NeoWeapon(WeaponsCollectionByType equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
    }

    public static NeoWeapon equipRandomWeapon(WeaponsCollectionByType.WeaponGroups weaponGroup) {
        ArrayList<WeaponsCollectionByType> weaponsCollectionByTypes = new ArrayList<>();
        for (WeaponsCollectionByType weaponsCollectionByType : WeaponsCollectionByType.values()) {
            if (weaponsCollectionByType.weaponGroups == weaponGroup) {
                weaponsCollectionByTypes.add(weaponsCollectionByType);
            }
        }
        int randomSeed = NeoRandom.rollDice(0, weaponsCollectionByTypes.size() - 1);
        return new NeoWeapon(weaponsCollectionByTypes.get(randomSeed));

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
        TRIDENT("Trident", WeaponGroups.EXOTIC, 1, 10),
        SPIKED_SWORD("Spiked Sword", WeaponGroups.EXOTIC, 4, 12),


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

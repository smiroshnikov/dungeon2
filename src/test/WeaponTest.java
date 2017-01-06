package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public final class WeaponTest {
    List<WeaponList> weaponList = Arrays.asList(WeaponList.values());

    public WeaponList pickRandomWeapon() {
        Random r = new Random();
        return weaponList.get(r.nextInt(weaponList.size()));
    }

    public WeaponList pickRandomByType(WeaponList.WeaponType weaponType) {
        ArrayList<WeaponList> weapons = new ArrayList<>();
        for (WeaponList weapon : WeaponList.values()) {
            if (weapon.weaponType == weaponType) {
                weapons.add(weapon);
            }
        }
        Random r = new Random();
        int randomSeed = r.nextInt(weapons.size());
        return (weapons.get(randomSeed));
    }

    public enum WeaponList {
        AXE("1 Handed Axe", WeaponType.MARTIAL, 1, 2),
        WHIP("Whip", WeaponType.EXOTIC, 1, 3),
        CLAWS("CLaws", WeaponType.NATURAL, 1, 12),
        TWOHANDEDAXE("Lightning Axe", WeaponType.EXOTIC, 1, 12),
        BASTARD_SWORD("Bastard Sword", WeaponType.EXOTIC, 2, 10),
        FIRE_SPEAR("Fire Spear", WeaponType.NATURAL, 2, 8),

        BARBED_WHIP("Barbed Whip ", WeaponType.MARTIAL, 1, 4),
        FLAMBERGE("FLAMBERGE", WeaponType.EXOTIC, 4, 16),
        TRIDENT("Trident", WeaponType.EXOTIC, 1, 10),
        SPIKED_SWORD("Spiked Sword", WeaponType.EXOTIC, 4, 12),


        FETIDCLAWS("Fetid Claws", WeaponType.NATURAL, 1, 2),
        SHARPTEETH("Sharp Teeth", WeaponType.NATURAL, 1, 2),

        ICEBREATH("Ice Breath", WeaponType.EXOTIC, 6, 12);

        int minDamage;
        int maxDamage;
        private String weaponName;
        private WeaponType weaponType;

        WeaponList(String weaponName, WeaponType weaponType, int minDamage, int maxDamage) {
            this.minDamage = minDamage;
            this.maxDamage = maxDamage;
            this.weaponName = weaponName;
            this.weaponType = weaponType;
        }

        public enum WeaponType {
            MARTIAL,
            NATURAL,
            EXOTIC
        }

    }

}

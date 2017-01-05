package test;

import java.util.ArrayList;
import java.util.Random;

public class WeaponTest {
    private static final ArrayList<WeaponList> weapons = new ArrayList<>();
    private static final Random RANDOM = new Random();
    private static final int SIZEOFWEAPONLIST = weapons.size();

    public static int getSIZEOFWEAPONLIST() {
        return SIZEOFWEAPONLIST;
    }

    public WeaponList pickRandomWeapon() {
        return weapons.get(RANDOM.nextInt(SIZEOFWEAPONLIST));
    }

    public void printWeapons() {
        for (WeaponList element : weapons) {
            System.out.println(element);

        }
    }

    private enum WeaponList {
        AXE("1 Handed Axe", WeaponType.MARTIAL, 1, 2),
        WHIP("Whip", WeaponType.EXOTIC, 1, 3),
        CLAWS("CLaws", WeaponType.NATURAL, 1, 12);

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

        private enum WeaponType {
            MARTIAL,
            NATURAL,
            EXOTIC
        }

    }

}

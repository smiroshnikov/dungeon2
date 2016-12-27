package com.company;


import java.util.ArrayList;
import java.util.Random;

public class Weapon {
    private static final Random r = new Random();
    private BaseWeapon baseWeapon;
    private int damageModifier;


    public Weapon(BaseWeapon baseWeapon, int damageModifier) {
        // For enchanted weapon
        this.baseWeapon = baseWeapon;
        this.damageModifier = damageModifier;
    }

    public Weapon(BaseWeapon baseWeapon) {
        this.baseWeapon = baseWeapon;
        this.damageModifier = 0;
    }

    public static Weapon getRandomWeapon(BaseWeapon.Type weaponType) {
        // TODO read on collections and Generics
        ArrayList<BaseWeapon> baseWeapons = new ArrayList<>();
        for (BaseWeapon baseWeapon : BaseWeapon.values()) {
            if (baseWeapon.weaponType == weaponType) {
                baseWeapons.add(baseWeapon);
            }
        }
        int randomSeed = r.nextInt(baseWeapons.size());
        return new Weapon(baseWeapons.get(randomSeed));
    }

    public int generateWeaponDamage() {
        //2d6 = 12-2+2+modifier
        return r.nextInt(baseWeapon.baseDamageMax - baseWeapon.baseDamageMin)
                + baseWeapon.baseDamageMin + damageModifier;
    }

    @Override
    public String toString() {
        return baseWeapon.weaponName;

    }

    public enum BaseWeapon {
        CLAWS("claws", Type.NATURAL, 1, 6),
        TEETH("teeth", Type.NATURAL, 4, 8),
        FIREBREATH("Fire Breath", Type.NATURAL, 8, 16),
        TWO_HANDED_AXE("2H Axe", Type.ARMS, 2, 12),
        LONGSWORD("Long Sword", Type.ARMS, 1, 8),
        WHIP("Barbed Whip", Type.EXOTIC, 4, 5),
        RUSTY_KNIFE("Long Sword", Type.ARMS, 1, 8);

        private final String weaponName;
        private final Type weaponType;
        private final int baseDamageMin;
        private final int baseDamageMax;

        BaseWeapon(String weaponName, Type weaponType, int baseDamageMin, int baseDamageMax) {
            this.weaponName = weaponName;
            this.weaponType = weaponType;
            this.baseDamageMin = baseDamageMin;
            this.baseDamageMax = baseDamageMax;
        }


        public enum Type {
            NATURAL,
            ARMS,
            EXOTIC,
        }

    }

}

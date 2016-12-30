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
        CLAWS("Claws", Type.NATURAL, 4, 6),
        TEETH("Teeth", Type.NATURAL, 2, 8),
        TENTACLES("Tentacles", Type.NATURAL, 8, 16),


        FIREBREATH("Fire Breath", Type.SUPERNATURAL, 8, 16),
        SPIKES("SPIKES", Type.SUPERNATURAL, 1, 3),
        ACID_SPIT("Acid Spit", Type.SUPERNATURAL, 4, 16),


        TWO_HANDED_AXE("2H Axe", Type.ARMS, 2, 14),
        TWO_HANDED_SWORD("2H Sword", Type.ARMS, 4, 11),
        TWO_HANDED_MACE("2H Mace", Type.ARMS, 6, 10),
        HALBERD("Halberd", Type.ARMS, 2, 17),
        LONGSWORD("Long Sword", Type.ARMS, 1, 8),

        RUSTY_KNIFE("Rusty Knife", Type.SIMPLE, 1, 3),
        CLUB("Club", Type.SIMPLE, 1, 6),

        ANCIENT_CURSE("Ancient Curse", Type.CASTER, 1, 6),
        LIGHTNING_BOLT("Lightning Bolt", Type.CASTER, 1, 6),
        FIREBALL("Fireball", Type.CASTER, 6, 36),
        FIRESTORM("Firestorm", Type.CASTER, 10, 50),
        FROSTBLADE("Frost blade", Type.CASTER, 1, 6),



        WHIP("Barbed Whip", Type.EXOTIC, 4, 5),
        ESTOC("Estoc", Type.EXOTIC, 7, 11),
        TWO_HANDED_CURVED_SWORD("Two Handed Curved Sword", Type.EXOTIC, 12, 18),
        FLAMBERGE("Flamberge", Type.EXOTIC, 5, 13),
        TRIDENT("Trident", Type.EXOTIC, 4, 5);


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
            SUPERNATURAL,
            ARMS,
            EXOTIC,
            SIMPLE,
            CASTER

        }

    }

}

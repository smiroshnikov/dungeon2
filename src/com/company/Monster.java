package com.company;

public class Monster {
    final private MonsterRace race;
    private Weapon monsterEquippedWeapon;
    private String monsterName;


    public Monster(MonsterRace race, Weapon monsterEquippedWeapon) {
        this(race, monsterEquippedWeapon, Randomizer.getRandomString());
    }

    public Monster(MonsterRace race, Weapon monsterEquippedWeapon, String monsterName) {
        this.race = race;
        this.monsterEquippedWeapon = monsterEquippedWeapon;
        this.monsterName = monsterName;
    }

    public static Monster getRandomMonster() {
        MonsterRace monsterRace = MonsterRace.values()[Randomizer.getRandomNumber(0, MonsterRace.values().length)];
        Weapon randomWeapon = Weapon.getRandomWeapon(monsterRace.baseWeaponType);
        return new Monster(monsterRace, randomWeapon);
    }

    public static Monster getRandomMonsterByRace(MonsterRace monsterRace) {
        // I added this
        Weapon randomWeapon = Weapon.getRandomWeapon(monsterRace.baseWeaponType);
        return new Monster(monsterRace, randomWeapon);
    }


    @Override
    public String toString() {
        return "[" + race.getRaceName().toUpperCase() + "]" +
                " is armed with " + "-" + monsterEquippedWeapon.toString().toUpperCase() +
                "-";
    }

    public String getMonsterName() {
        return monsterName;
    }

    public int doDamage() {
        return monsterEquippedWeapon.generateWeaponDamage();

    }

    public enum MonsterRace {
        GOBLINOID("Goblin", Weapon.BaseWeapon.Type.SIMPLE),
        GOBLINWARRIOR("Goblin Warrior", Weapon.BaseWeapon.Type.ARMS),
        GOBLINSHAMAN("Goblin Shaman", Weapon.BaseWeapon.Type.CASTER),

        DRACONID_WARRIOR("Draconid warrior", Weapon.BaseWeapon.Type.ARMS),
        DRAGON_MAGE("Dragon Mage", Weapon.BaseWeapon.Type.CASTER),
        DRAGON_ARCH_MAGE("Dragon Arch-mage", Weapon.BaseWeapon.Type.CASTER),

        ORC_WARRIOR("Orc warrior", Weapon.BaseWeapon.Type.ARMS),
        ORC_SHAMAN("Orc Shaman", Weapon.BaseWeapon.Type.CASTER),

        SHAPELESS("Shape shifter", Weapon.BaseWeapon.Type.NATURAL),

        RAT("Rabid Rat", Weapon.BaseWeapon.Type.NATURAL),
        WARPIG("WarPig Rider", Weapon.BaseWeapon.Type.ARMS),

        WERESHARK("Wereshark ", Weapon.BaseWeapon.Type.NATURAL),

        ASSASSIN("Shadow assassin", Weapon.BaseWeapon.Type.EXOTIC),
        SHADOW_MAGE("Shadow mage", Weapon.BaseWeapon.Type.CASTER);

        private String raceName;
        private Weapon.BaseWeapon.Type baseWeaponType;

        MonsterRace(String raceName, Weapon.BaseWeapon.Type weaponType) {
            this.raceName = raceName;
            this.baseWeaponType = weaponType;
        }


        public String getRaceName() {
            return raceName;
        }
    }

}

package com.company;

public class Monster {
    final private MonsterRace race;
    private Weapon monsterEquippedWeapon;
    private String monsterName;

    public Monster(MonsterRace race) {
        this(race, null);
    }

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


    @Override
    public String toString() {
        return "[" + race.raceName.toUpperCase() + "]" +
                " is armed with " + "*" + monsterEquippedWeapon + "*"
                ;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public int doDamage() {
        return monsterEquippedWeapon.generateWeaponDamage();

    }

    public enum MonsterRace {
        GOBLIN("goblinoid", Weapon.BaseWeapon.Type.ARMS),
        DRAGON("draconid", Weapon.BaseWeapon.Type.NATURAL),
        ORC("orc", Weapon.BaseWeapon.Type.ARMS),
        SHAPELESS("shapeless", Weapon.BaseWeapon.Type.NATURAL),
        ANIMAL("animal", Weapon.BaseWeapon.Type.NATURAL);

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

package NEO;

public class NeoMonster {

    // final private MonsterType.BaseRace race;
    final private MonsterType monsterType;
    final private NeoWeapon monsterEquippedWeapon;
    private int hp;

    public NeoMonster(MonsterType monsterType, int minHp, int maxHp, NeoWeapon monsterEquippedWeapon) {
        this.monsterEquippedWeapon = monsterEquippedWeapon;
        this.hp = NeoRandom.rollDice(minHp, maxHp);
        this.monsterType = monsterType;
    }
//      TODO getRandom Monster with Weapons later on
//    public static NeoMonster getRandomMonsterWithWeapon() {
//        MonsterType monsterType = MonsterType.values()[Randomizer.getRandomNumber(0,MonsterType.values().length)];
//        NeoWeapon randomWeapon = NeoWeapon.getRandomWeapon(monsterType.baseRace);
//
//        return monsterType;
//    }

    @Override
    public String toString() {
        return monsterType.monsterDescription +
                " has " + hp + " hp" + "\n" + "This monster base race is " +
                monsterType.baseRace + "\n" + "He is equipped with " + monsterEquippedWeapon;
    }

    public enum MonsterType {
        // TODO this whole structure is not used !!!
        // TODO  what OTHER parameters I expect to see down below ? Loot ? Allowed weapon types ?
        // DCL("Dracolich Slayer", BaseRace.Minotaur, Weapon.AllowedWeaponType.Axes) ?

        GOBWAR("Goblin Warrior", BaseRace.GOBLINOID, NeoWeapon.WeaponsCollectionByType.WeaponGroups.EXOTIC),
        GS("Goblin Shaman", BaseRace.GOBLINOID, NeoWeapon.WeaponsCollectionByType.WeaponGroups.MARTIAL),
        OCHF("Orc War-chief", BaseRace.ORC, NeoWeapon.WeaponsCollectionByType.WeaponGroups.MARTIAL),
        ORCS("Orc Shaman", BaseRace.ORC, NeoWeapon.WeaponsCollectionByType.WeaponGroups.CASTER),
        KSC("Kobold Sorcerer", BaseRace.KOBOLD, NeoWeapon.WeaponsCollectionByType.WeaponGroups.CASTER),
        RAT("Rabid Rat", BaseRace.ANIMAL, NeoWeapon.WeaponsCollectionByType.WeaponGroups.NATURAL),
        WERERAT("Were rat", BaseRace.ANIMAL, NeoWeapon.WeaponsCollectionByType.WeaponGroups.NATURAL),;

        // TODO this whole structure is not used !!!

        private final String monsterDescription;
        private final BaseRace baseRace;
        private final NeoWeapon.WeaponsCollectionByType.WeaponGroups allowedWeapon;

        // TODO this whole structure is not used !!!

        MonsterType(String monsterDescription, BaseRace baseRace,
                    NeoWeapon.WeaponsCollectionByType.WeaponGroups allowedWeapon) {
            this.monsterDescription = monsterDescription;
            this.baseRace = baseRace;

            // here will be random ... probably
            this.allowedWeapon = allowedWeapon;
        }

        public enum BaseRace {
            GOBLINOID,
            ORC,
            KOBOLD,
            DRAGON,
            INSECT,
            ABERRATION,
            SHAPESHIFTER,
            ANIMAL
        }
    }
}

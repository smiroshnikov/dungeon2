package NEO;

public class NeoMonster {


    // final private MonsterType.BaseRace race;
    final private MonsterType monsterType;
    final private NeoWeapon monsterEquippedWeapon;

    private int hp;

    public NeoMonster(MonsterType monsterType, int minHp, int maxHp, NeoWeapon monsterEquippedWeapon) {
        this.monsterEquippedWeapon = monsterEquippedWeapon;
        this.hp = NeoRandom.rollDice(minHp, maxHp);
//        this.race = race;
        this.monsterType = monsterType;

    }


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

        GOBWAR("Goblin Warrior", BaseRace.GOBLINOID, 1, 3),
        GS("Goblin Shaman", BaseRace.GOBLINOID, 1, 5),
        OCHF("Orc War-chief", BaseRace.ORC, 10, 20),
        ORCS("Orc Shaman", BaseRace.ORC, 1, 5),
        KSC("Kobold Sorcerer", BaseRace.KOBOLD, 1, 5),
        RAT("Rabid Rat", BaseRace.ANIMAL, 1, 5),
        WERERAT("Were rat", BaseRace.ANIMAL, 1, 5),;

        // TODO this whole structure is not used !!!

        private final String monsterDescription;
        private final BaseRace baseRace;
        private final int baseDamageMin;
        private final int baseDamageMax;

        // TODO this whole structure is not used !!!

        MonsterType(String monsterDescription, BaseRace baseRace, int baseDamageMin, int baseDamageMax) {
            this.monsterDescription = monsterDescription;
            this.baseRace = baseRace;
            this.baseDamageMin = baseDamageMin;
            this.baseDamageMax = baseDamageMax;
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

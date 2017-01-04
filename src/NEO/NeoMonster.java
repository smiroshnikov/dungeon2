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

        GOBWAR("Goblin Warrior", BaseRace.GOBLINOID, NeoWeapon.Weapons.WeaponType.EXOTIC),
        GS("Goblin Shaman", BaseRace.GOBLINOID, NeoWeapon.Weapons.WeaponType.MARTIAL),
        OCHF("Orc War-chief", BaseRace.ORC, NeoWeapon.Weapons.WeaponType.MARTIAL),
        ORCS("Orc Shaman", BaseRace.ORC, NeoWeapon.Weapons.WeaponType.CASTER),
        KSC("Kobold Sorcerer", BaseRace.KOBOLD, NeoWeapon.Weapons.WeaponType.CASTER),
        RAT("Rabid Rat", BaseRace.ANIMAL, NeoWeapon.Weapons.WeaponType.NATURAL),
        WERERAT("Were rat", BaseRace.ANIMAL, NeoWeapon.Weapons.WeaponType.NATURAL),;

        // TODO this whole structure is not used !!!

        private final String monsterDescription;
        private final BaseRace baseRace;
        private final NeoWeapon.Weapons.WeaponType allowedWeapon;

        // TODO this whole structure is not used !!!

        MonsterType(String monsterDescription, BaseRace baseRace,
                    NeoWeapon.Weapons.WeaponType allowedWeapon) {
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

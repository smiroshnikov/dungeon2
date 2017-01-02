package NEO;

public class NeoMonster {
    private int minHp;
    private int maxHp;
    private int hp;
    final private Monsters.BaseRace race;

    public NeoMonster(Monsters.BaseRace race, int minHp, int maxHp) {
        this.hp = NeoRandom.rollDice(minHp, maxHp);
        this.race = race;
    }

    @Override
    public String toString() {
        return "NeoMonster{" +
                "hp=" + hp +
                ", race=" + race +
                '}';
    }

    public enum Monsters {
        // TODO this whole structure is not used !!!
        // TODO this is how I want to generate monsters , randomly !

        GW("Goblin Warrior", BaseRace.GOBLINOID, 1, 3),
        GS("Goblin Shaman", BaseRace.GOBLINOID, 1, 5),
        OCHF("Orc War-chief", BaseRace.ORC, 10, 20),
        ORCS("Orc Shaman", BaseRace.ORC, 1, 5),
        KSC("Kobold Sorcerer", BaseRace.KOBOLD, 1, 5);

        // TODO this whole structure is not used !!!

        private final String monsterDescription;
        private final BaseRace baseRace;
        private final int baseDamageMin;
        private final int baseDamageMax;

        // TODO this whole structure is not used !!!

        Monsters(String monsterDescription, BaseRace baseRace, int baseDamageMin, int baseDamageMax) {
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
            SHAPESHIFTER
        }
    }
}

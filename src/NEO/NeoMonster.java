package NEO;

/**
 * Created by sergei.miroshnikov on 31/12/2016.
 */
public class NeoMonster {
    private static int hp;

    public NeoMonster(int hp) {
        this.hp = hp;

    }

    private enum MonsterRace {
        GOBLINOID("Goblin");

        private String raceName;

        MonsterRace(String raceName) {
            this.raceName = raceName;
        }

        public String getRaceName() {
            return raceName;
        }


    }
}

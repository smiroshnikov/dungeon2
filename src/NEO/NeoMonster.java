package NEO;

/**
 * Created by sergei.miroshnikov on 31/12/2016.
 */
public class NeoMonster {
    private static int hp;
    private static String race;

    public NeoMonster(int hp, String race) {
        this.hp = hp;
        this.race = race;

    }

    public enum MonsterRace {
        GOBLIN {},
        ORC {}

    }
}
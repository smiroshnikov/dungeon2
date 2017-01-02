package NEO;

public class NeoDungeon {
    public static void main(String[] args) {

        NeoWeapon w = new NeoWeapon(1, 20);
        NeoMonster m = new NeoMonster(NeoMonster.MonsterType.GW, 1, 5);
        NeoMonster m2 = new NeoMonster(NeoMonster.MonsterType.KSC, 1, 2);
        System.out.printf("%s%n", m.toString());
        System.out.printf("%s%n", m2.toString());

        // random weapon roll
        for (int i = 0; i < 1; i++) {
            System.out.printf("%d%n", w.getRollWeaponDamage());

        }

    }
}

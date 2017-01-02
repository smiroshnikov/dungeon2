package NEO;

public class NeoDungeon {
    public static void main(String[] args) {

        NeoWeapon w = new NeoWeapon(1, 20);
        NeoMonster m3 = new NeoMonster(NeoMonster.MonsterType.GW,w.Weapons.TWOHANDEDAXE,1,3);

        System.out.printf("%s%n", m3.toString());

        // random weapon roll
        for (int i = 0; i < 1; i++) {
            System.out.printf("%d%n", w.getRollWeaponDamage());

        }

    }
}

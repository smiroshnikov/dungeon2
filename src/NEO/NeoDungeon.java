package NEO;

import static NEO.NeoWeapon.Weapons.TWOHANDEDAXE;
// fix this crap

public class NeoDungeon {
    public static void main(String[] args) {

        NeoWeapon w = new NeoWeapon(1, 6, TWOHANDEDAXE);
        NeoMonster m3 = new NeoMonster(NeoMonster.MonsterType.GOBWAR, 1, 3, w);

        System.out.printf("%s%n", m3.toString());

        // random weapon roll
        for (int i = 0; i < 1; i++) {
            System.out.printf("%d%n", w.getRollWeaponDamage());

        }
    }
}

package NEO;


// fix this crap

public class NeoDungeon {
    public static void main(String[] args) {

        NeoWeapon w = new NeoWeapon(NeoWeapon.Weapons.BARBED_WHIP);
        NeoWeapon k = new NeoWeapon(NeoWeapon.Weapons.SHARPTEETH);
        NeoWeapon z = new NeoWeapon(NeoWeapon.Weapons.TWOHANDEDAXE);


        NeoMonster m3 = new NeoMonster(NeoMonster.MonsterType.GOBWAR, 4, 8, w);
        NeoMonster m2 = new NeoMonster(NeoMonster.MonsterType.KSC, 2, 4, k);
        NeoMonster m1 = new NeoMonster(NeoMonster.MonsterType.WERERAT, 1, 2, z);

        System.out.printf("%s%n", m1.toString());
        System.out.printf("%d%n", w.getRollWeaponDamage());

        System.out.printf("%s%n", m2.toString());
        System.out.printf("%d%n", k.getRollWeaponDamage());

        System.out.printf("%s%n", m3.toString());
        System.out.printf("%d%n", z.getRollWeaponDamage());

    }
}

package NEO;

public class NeoDungeon {
    public static void main(String[] args) {

        NeoWeapon goblinShamanSpell = new NeoWeapon(NeoWeapon.Weapons.ICE_BREATH);
        NeoMonster azog = new NeoMonster(NeoMonster.MonsterType.GS, 4, 8, goblinShamanSpell);
//        NeoMonster test = new NeoMonster(NeoMonster.MonsterType.GOBWAR, 2, 6, new NeoWeapon(NeoWeapon.Weapons.BARBED_WHIP));
        System.out.printf("%s%n", azog.toString());
        System.out.printf("he hits you for %d points of damage %n", goblinShamanSpell.getRollWeaponDamage());

    }
}

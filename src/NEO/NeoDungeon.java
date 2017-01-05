package NEO;

public class NeoDungeon {
    public static void main(String[] args) {

//        NeoWeapon goblinShamanSpell = new NeoWeapon(NeoWeapon.WeaponsCollectionByType.ICE_BREATH);
        NeoMonster azog = new NeoMonster(NeoMonster.MonsterType.GS, 4, 8);
//        NeoMonster test = new NeoMonster(NeoMonster.MonsterType.GOBWAR, 2, 6, new NeoWeapon(NeoWeapon.WeaponsCollectionByType.BARBED_WHIP));
        System.out.printf("%s%n", azog.toString());

    }
}

package NEO;

public class NeoDungeon {
    public static void main(String[] args) {

        NeoWeapon w = new NeoWeapon(1, 20);
        NeoMonster m = new NeoMonster(NeoMonster.Monsters.BaseRace.KOBOLD,
                1, 10);
        System.out.printf("%s%n",m.toString());


        for (int i = 0; i < 1; i++) {
            System.out.printf("%d%n", w.getRollWeaponDamage());

        }

    }
}

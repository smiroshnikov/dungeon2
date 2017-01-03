package com.company;

// TODO WRITE EVERYTHING AGAIN . GO FOR CLASSES !

public class Main {
    // TODO collections MUST

    public static void main(String[] args) {

        //
        //Monster dracolich = new Monster(Monster.MonsterRace.DRACONID_WARRIOR, Weapon.getRandomWeapon(Weapon.BaseWeapon.Type.NATURAL));
//        Monster goblinWarrior = new Monster(Monster.MonsterRace.GOBLIN, Weapon.getRandomWeapon(Weapon.BaseWeapon.Type.MARTIAL));
        // System.out.println(dracolich.toString());
//        System.out.println(goblinWarrior.toString());
//
//        int i = 0;
//        do {
//            System.out.printf("%s hit you for %d%n",dracolich.getMonsterName(), dracolich.doDamage());
//            System.out.printf("%s hit you for %d%n",goblinWarrior.getMonsterName() ,goblinWarrior.doDamage());
//
//            i += 1;
//        } while (i < 3);
//        */


        Monster[] monsterList = new Monster[100];
        for (int i = 0; i < 100; i++) {
            if (i < 50) {
                //   monsterList[i] = Monster.getRandomMonster();
                monsterList[i] = Monster.getRandomMonsterByRace(Monster.MonsterRace.ASSASSIN);
            } else {
                monsterList[i] = Monster.getRandomMonster();
            }
        }
        for (Monster monster : monsterList) {
            System.out.println(//monster.getMonsterName() +
                    " "
                            + monster.toString() + " hits you for "
                            + monster.doDamage());

        }
        Monster k = new Monster(Monster.MonsterRace.RAT, Weapon.getRandomWeapon(Weapon.BaseWeapon.Type.SUPERNATURAL));
        System.out.println(k.toString());
    }


}


package com.company;

public class Main {

    public static void main(String[] args) {

//        /*
//        Monster dracolich = new Monster(Monster.MonsterRace.DRAGON, Weapon.getRandomWeapon(Weapon.BaseWeapon.Type.NATURAL));
//        Monster goblinWarrior = new Monster(Monster.MonsterRace.GOBLIN, Weapon.getRandomWeapon(Weapon.BaseWeapon.Type.ARMS));
//        System.out.println(dracolich.toString());
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
        Monster[] monsterList = new Monster[10];
        for (int i = 0; i < 10; i++) {
            monsterList[i] = Monster.getRandomMonster();

        }
        for (Monster monster : monsterList) {
            System.out.println(monster.toString() + " hits you for " + monster.doDamage());

        }
    }


}


package test;

public class Test {
    public static void main(String[] args) {
        WeaponTest t = new WeaponTest();

        System.out.println(t.pickRandomByType(WeaponTest.WeaponList.WeaponType.NATURAL));
        System.out.println(t.pickRandomWeapon().toString());
    }
}
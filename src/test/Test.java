package test;

public class Test {
    public static void main(String[] args) {
        WeaponTest t = new WeaponTest();
        for (int i = 0; i < 100; i++) {
            System.out.println(t.pickRandomWeapon());
        }


    }
}

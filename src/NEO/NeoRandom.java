package NEO;

import java.util.Random;

public final class NeoRandom {
    private final static Random RANDOM = new Random();

    public static int rollDice(int min, int max) {
        return RANDOM.nextInt(max+1 - min) + min;
    }


}

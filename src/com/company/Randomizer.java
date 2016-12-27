package com.company;

import java.util.Random;

public final class Randomizer {
    private final static Random RANDOM = new Random();
    private final static String[] kuchaStringov;

    static {
        kuchaStringov = ("Granvedd Havenflow\n" +
                "Nokvum Dewmaw\n" +
                "Noger Stev\n" +
                "Grem Romug\n" +
                "Renvorth Monstertoe\n" +
                "Vuth Dustblower\n" +
                "Tahaohvid Nethipvub\n" +
                "La-Rer Naltruk\n" +
                "Broujomzald Davzimyene\n" +
                "Shervar Idotra\n" +
                "Iep Tay\n" +
                "Thiey Kueng\n" +
                "Vedrailen Runzohi\n" +
                "Crura Jundami" + "Ihreseil Niken\n" +
                "Yehreih Bedod\n" +
                "Sisrusso Rosechaser\n" +
                "Sulseell Treeshine\n" +
                "Telo Didz\n" +
                "Cha Vakadz\n" +
                "Kogegey Pridesteel\n" +
                "Seri Crestbrew\n" +
                "Haphiche Vuevekdihk\n" +
                "Horih Buuhred\n" +
                "Virlivil Trubebubi\n" +
                "Mivu Utrodo\n" +
                "Yue Cien\n" +
                "Zai Laon\n" +
                "Battb Haholdu\n" +
                "Ort Zestoscar").split("\n");
    }

    public static int getRandomNumber(int min, int max) {
        return RANDOM.nextInt(max - min) + min;
    }

    public static String getRandomString() {
        return kuchaStringov[RANDOM.nextInt(kuchaStringov.length)];

    }


}

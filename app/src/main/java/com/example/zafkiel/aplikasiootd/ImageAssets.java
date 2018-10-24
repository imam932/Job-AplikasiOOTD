package com.example.zafkiel.aplikasiootd;

import java.util.ArrayList;
import java.util.List;

public class ImageAssets {

    //Variabel pengelompokkan dan penyimpanan data untuk torso
    private static List<Integer> torso = new ArrayList<Integer>(){{
        add(R.drawable.baju1);
        add(R.drawable.baju2);
        add(R.drawable.baju3);
        add(R.drawable.baju4);
        add(R.drawable.baju5);

    }};

    //Variabel pengelompokkan dan penyimpanan data untuk legs
    private static List<Integer> legs = new ArrayList<Integer>(){{
        add(R.drawable.celana1);
        add(R.drawable.celana2);
        add(R.drawable.celana3);
        add(R.drawable.celana4);
        add(R.drawable.celana5);
    }};

    //method getter

    public static List<Integer> getTorso() {
        return torso;
    }

    public static List<Integer> getLegs() {
        return legs;
    }
}

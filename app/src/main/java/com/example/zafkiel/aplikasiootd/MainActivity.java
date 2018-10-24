package com.example.zafkiel.aplikasiootd;

import android.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //instance state
        if (savedInstanceState == null) {
            //inisiasi adapter untuk mengaktifkan fragment
            FragmentManager fragmentManager = getSupportFragmentManager();

            //inisiasi object fragment
            ClothPartFragment fragmentPart;

            //membuat & mengambil fragment body
            fragmentPart = new ClothPartFragment();
            fragmentPart.setmImageIds(ImageAssets.getTorso());
            fragmentPart.setmListIndex(0);
            //transaksi fragment body
            fragmentManager.beginTransaction().add(R.id.torso_container, fragmentPart).commit();

            //membuat & mengambil fragment leg
            fragmentPart = new ClothPartFragment();
            fragmentPart.setmImageIds(ImageAssets.getLegs());
            fragmentPart.setmListIndex(0);
            //transaksi fragment leg
            fragmentManager.beginTransaction().add(R.id.legs_container, fragmentPart).commit();
        }
    }
}

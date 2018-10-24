package com.example.zafkiel.aplikasiootd;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //membuat intent
        final Intent ToCover = new Intent(this, Cover.class);
        //penghitung waktu mundur
        new CountDownTimer(3000,1000) {
            @Override
            public void onTick(long l) {

            }
            public void onFinish() {
                startActivity(ToCover);
                finish();
            }
        }.start();
    }
}

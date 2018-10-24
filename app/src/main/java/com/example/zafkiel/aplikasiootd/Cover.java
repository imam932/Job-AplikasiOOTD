package com.example.zafkiel.aplikasiootd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class Cover extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cover);
        //membuat intent
        final Intent toMain = new Intent(this,MainActivity.class);
        Button startButton = (Button)findViewById(R.id.start);
        //menset button saat diklik
        startButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(toMain);
                finish();
            }
        });
    }
}

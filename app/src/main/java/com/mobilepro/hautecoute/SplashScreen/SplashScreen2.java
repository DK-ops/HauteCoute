package com.mobilepro.hautecoute.SplashScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.mobilepro.hautecoute.R;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen2);

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen2.this, SplashScreen3.class);
                startActivity(intent);
                finish();
            }
        },1777);
    }
}
package com.mobilepro.hautecoute.SplashScreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.mobilepro.hautecoute.R;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreen1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen1);

        Timer timer1 = new Timer();
        timer1.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent1 = new Intent(SplashScreen1.this, SplashScreen2.class);
                startActivity(intent1);
                finish();
            }
        },1777);
    }
}
package com.mobilepro.hautecoute;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class OnBoarding extends AppCompatActivity {
    Button btnlog, btnGuest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding);

        btnlog = findViewById(R.id.btnlog);
        btnGuest = findViewById(R.id.btnGuest);

        }

    public void toLog(View view) {
        this.btnlog = btnlog;
        Intent intent = new Intent(OnBoarding.this, LoginP.class);
        startActivity(intent);
        finish();
    }
}


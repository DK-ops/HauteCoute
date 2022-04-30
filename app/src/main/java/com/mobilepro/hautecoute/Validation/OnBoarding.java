package com.mobilepro.hautecoute.Validation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mobilepro.hautecoute.NavView.MainActivity;
import com.mobilepro.hautecoute.R;

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
        Intent intent = new Intent(OnBoarding.this, LoginP.class);
        startActivity(intent);
        finish();
    }

    public void toLogGuest(View view){
        Intent intent1 = new Intent(OnBoarding.this, MainActivity.class );
        startActivity(intent1);
        finish();
    }
}


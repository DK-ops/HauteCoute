package com.mobilepro.hautecoute;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.mobilepro.hautecoute.NavView.ThirdFragment;

public class MixMatchResult extends AppCompatActivity implements View.OnClickListener {

    ImageButton imgarow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mix_match_result);

        imgarow = (ImageButton) findViewById(R.id.imgarrow);

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MixMatchResult.this, ThirdFragment.class);
        startActivity(intent);
    }
}
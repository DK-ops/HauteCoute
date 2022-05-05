package com.mobilepro.hautecoute.Shipping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.mobilepro.hautecoute.R;

public class DetailBaju1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_baju1);

        Button btntoshop = (Button) findViewById(R.id.btntoLink);

        btntoshop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://shorturl.at/bcuET"));
                startActivity(viewIntent);
            }
        });
    }

}
package com.mobilepro.hautecoute.Shipping;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.mobilepro.hautecoute.R;

public class ChooseClothes extends AppCompatActivity implements View.OnClickListener{

    ImageButton imgarrow1,
                imgbtncloth1,imgbtncloth2,imgbtncloth3,imgbtncloth4,
                imgbtncloth5,imgbtncloth6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_clothes);

        imgarrow1 = (ImageButton) findViewById(R.id.imgarrow1);
        imgbtncloth1 = (ImageButton) findViewById(R.id.imgbtncloth1);
        imgbtncloth2 = (ImageButton) findViewById(R.id.imgbtncloth2);
        imgbtncloth3 = (ImageButton) findViewById(R.id.imgbtncloth3);
        imgbtncloth4 = (ImageButton) findViewById(R.id.imgbtncloth4);
        imgbtncloth5 = (ImageButton) findViewById(R.id.imgbtncloth5);
        imgbtncloth6 = (ImageButton) findViewById(R.id.imgbtncloth6);
        imgbtncloth1.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.imgbtncloth1:
                Intent intent = new Intent(ChooseClothes.this, DetailBaju1.class);
                startActivity(intent);

                break;

        }
    }
}

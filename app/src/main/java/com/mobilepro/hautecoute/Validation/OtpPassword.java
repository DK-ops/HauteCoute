package com.mobilepro.hautecoute.Validation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.mobilepro.hautecoute.R;

public class OtpPassword extends AppCompatActivity {

    Button btnbacktoprev, btnOtpFill;
    EditText edtOtpFill;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp_password);


        btnOtpFill = findViewById(R.id.btnOtpConfirm);
        btnbacktoprev = findViewById(R.id.backtoprev);
        edtOtpFill = findViewById(R.id.edtOtpFill);
        btnOtpFill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent log = new Intent(OtpPassword.this, LoginP.class);
                startActivity(log);
                finish();
            }
        });
        btnbacktoprev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent toprev = new Intent(OtpPassword.this, ForgotPass.class);
                startActivity(toprev);
                finish();
            }
        });
    }
}
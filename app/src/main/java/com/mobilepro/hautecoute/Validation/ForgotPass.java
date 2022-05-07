package com.mobilepro.hautecoute.Validation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.mobilepro.hautecoute.R;

public class ForgotPass extends AppCompatActivity {

    Button btnverifEmail, backtologin;
    EditText edtforgotpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pass);

        btnverifEmail = findViewById(R.id.verifemail);
        backtologin = findViewById(R.id.backtoLog);
        edtforgotpass = findViewById(R.id.edtEmailFill);


        btnverifEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent resetPass = new Intent(ForgotPass.this, OtpPassword.class);
                startActivity(resetPass);
                finish();
            }
        });

        backtologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent backtoLog = new Intent(ForgotPass.this, LoginP.class);
                startActivity(backtoLog);
                finish();
            }
        });
    }
}
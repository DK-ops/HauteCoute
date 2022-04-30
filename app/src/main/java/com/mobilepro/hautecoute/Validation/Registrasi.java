package com.mobilepro.hautecoute.Validation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mobilepro.hautecoute.R;

public class Registrasi extends AppCompatActivity {
    Button btnRegist, btntoLogin;
    EditText edtRegist, edtPassReg, edtconPassReg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        edtRegist = findViewById(R.id.edtUnameReg);
        edtPassReg = findViewById(R.id.edtpasswordReg);
        edtconPassReg = findViewById(R.id.edtconpassword);
        btnRegist = findViewById(R.id.btnRegist);
        btntoLogin = findViewById(R.id.btntoLogin);

        btnRegist.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if (edtPassReg == edtconPassReg){
                    Intent intent = new Intent(Registrasi.this, LoginP.class);
                    startActivity(intent);
                    finish();
                }else if (edtPassReg != edtconPassReg){
                    Toast.makeText(Registrasi.this, "Password dan Konfirmasi Password Tidak Sama", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btntoLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent1 = new Intent(Registrasi.this, LoginP.class);
                startActivity(intent1);
                finish();
            }
        });
    }
}
package com.mobilepro.hautecoute;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginP extends AppCompatActivity {
    Button btnlogin, btntoRegist;
    EditText uname, passedt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_p);

        btnlogin = findViewById(R.id.btnLoginreal);
        btntoRegist = findViewById(R.id.btntoRegist);
        uname = findViewById(R.id.edtUname);
        passedt = findViewById(R.id.edtpassword);

        btnlogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String usernameKey = uname.getText().toString();
                String passwordKey = passedt.getText().toString();

                if (usernameKey.equals("admin") && passwordKey.equals("123")){
                    //jika login berhasil
                    Toast.makeText(getApplicationContext(), "Selamat Datang",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(LoginP.this, MainActivity.class);
                    startActivity(intent);
                    finish();
            }else {
//                    if failed
                    AlertDialog.Builder builder = new AlertDialog.Builder(LoginP.this);
                    builder.setMessage("Username atau Password Anda Salah!!!").setNegativeButton("Retry", null).create().show();
                }
            }
        });

        btntoRegist.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent1 = new Intent(LoginP.this, Registrasi.class);
                startActivity(intent1);
                finish();
            }
        });
    }
}
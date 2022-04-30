package com.mobilepro.hautecoute.Validation;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mobilepro.hautecoute.NavView.MainActivity;
import com.mobilepro.hautecoute.R;

public class LoginP extends AppCompatActivity {
    // creating constant keys for shared preferences.
    public static final String SHARED_PREFS = "shared_prefs";

    // key for storing email.
    public static final String USERNAME_KEY = "username_key";

    // key for storing password.
    public static final String PASSWORD_KEY = "password_key";
    // variable for shared preferences.
    SharedPreferences sharedpreferences;
    String username, password;
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

        // getting the data which is stored in shared preferences.
        sharedpreferences = getSharedPreferences(SHARED_PREFS, Context.MODE_PRIVATE);

        // in shared prefs inside het string method
        // we are passing key value as EMAIL_KEY and
        // default value is
        // set to null if not present.
        username = sharedpreferences.getString(USERNAME_KEY, null);
        password = sharedpreferences.getString(PASSWORD_KEY, null);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // to check if the user fields are empty or not.
                if (TextUtils.isEmpty(uname.getText().toString()) && TextUtils.isEmpty(passedt.getText().toString())) {
                    // this method will call when email and password fields are empty.
                    Toast.makeText(LoginP.this, "Please Enter Email and Password", Toast.LENGTH_SHORT).show();
                } else {
                    SharedPreferences.Editor editor = sharedpreferences.edit();

                    // below two lines will put values for
                    // email and password in shared preferences.
                    editor.putString(USERNAME_KEY, uname.getText().toString());
                    editor.putString(PASSWORD_KEY, passedt.getText().toString());

                    // to save our data with key and value.
                    editor.apply();

                    // starting new activity.
                    Intent i = new Intent(LoginP.this, MainActivity.class);
                    startActivity(i);
                    finish();
                }
            }
        });

        btntoRegist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(LoginP.this, Registrasi.class);
                startActivity(intent1);
                finish();
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (username != null && password != null) {
            Intent i = new Intent(LoginP.this, MainActivity.class);
            startActivity(i);
        }
    }
}
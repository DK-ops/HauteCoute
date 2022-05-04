package com.mobilepro.hautecoute.NavView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.mobilepro.hautecoute.R;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottomNavigationView = findViewById(R.id.bottomNavView);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        bottomNavigationView.setSelectedItemId(R.id.home1);
    }
    FirstFragment firstFragment = new FirstFragment();
    SecondFragment secondFragment = new SecondFragment();
    ThirdFragment thirdFragment = new ThirdFragment();
    FourthFragment fourthFragment = new FourthFragment();

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.home1:
                getSupportFragmentManager().beginTransaction().replace(R.id.mainLayout, firstFragment).commit();
                return true;

            case R.id.shopbag:
                getSupportFragmentManager().beginTransaction().replace(R.id.mainLayout, secondFragment).commit();
                return true;

            case R.id.mixMatch:
                getSupportFragmentManager().beginTransaction().replace(R.id.mainLayout, thirdFragment).commit();
                return true;
            case R.id.acc:
                getSupportFragmentManager().beginTransaction().replace(R.id.mainLayout, fourthFragment).commit();
                return true;
        }
        return false;
    }




}
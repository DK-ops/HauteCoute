package com.mobilepro.hautecoute.NavView;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.mobilepro.hautecoute.MixMatchResult;
import com.mobilepro.hautecoute.R;
import com.mobilepro.hautecoute.Validation.LoginP;
import com.mobilepro.hautecoute.Validation.OnBoarding;


public class ThirdFragment extends Fragment implements View.OnClickListener {
    Button myButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myView = inflater.inflate(R.layout.fragment_third, container, false);
        myButton = (Button) myView.findViewById(R.id.btnMatchGo);
        myButton.setOnClickListener(this::onClick);
        return myView;


    }


    @Override
    public void onClick(View view) {
        Intent intent1 = new Intent(getActivity(), MixMatchResult.class );
        startActivity(intent1);
    }
}
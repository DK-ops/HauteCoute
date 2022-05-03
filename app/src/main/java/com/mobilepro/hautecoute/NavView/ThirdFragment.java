package com.mobilepro.hautecoute.NavView;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.mobilepro.hautecoute.MixMatchResult;
import com.mobilepro.hautecoute.R;
import com.mobilepro.hautecoute.Validation.LoginP;
import com.mobilepro.hautecoute.Validation.OnBoarding;


public class ThirdFragment extends Fragment {
    public ThirdFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);

    }


}
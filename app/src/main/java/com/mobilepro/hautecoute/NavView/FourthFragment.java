package com.mobilepro.hautecoute.NavView;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.mobilepro.hautecoute.R;
import com.mobilepro.hautecoute.Shipping.ChooseClothes;
import com.mobilepro.hautecoute.Strip;

public class FourthFragment extends Fragment implements View.OnClickListener {
    SharedPreferences sharedpreferences;
    ImageButton btnlog;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myView = inflater.inflate(R.layout.fragment_fourth, container, false);
        btnlog = (ImageButton) myView.findViewById(R.id.imgadd);
        btnlog.setOnClickListener(this::onClick);
        return myView;
    }

    @Override
    public void onClick(View view) {
        Intent intent=  new Intent(getActivity(), Strip.class );
        startActivity(intent);
    }

}
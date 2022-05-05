package com.mobilepro.hautecoute.NavView;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.mobilepro.hautecoute.MixMatchResult;
import com.mobilepro.hautecoute.R;
import com.mobilepro.hautecoute.Shipping.ChooseClothes;

public class SecondFragment extends Fragment implements View.OnClickListener{
    ImageButton btnimg1ship,btnimg2ship,btnimg3ship,btnimg4ship,btnimg5ship,btnimg6ship;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View myView = inflater.inflate(R.layout.fragment_second, container, false);
        btnimg1ship = (ImageButton) myView.findViewById(R.id.imgbtnship1);
        btnimg2ship = (ImageButton) myView.findViewById(R.id.imgbtnship2);
        btnimg3ship = (ImageButton) myView.findViewById(R.id.imgbtnship3);
        btnimg4ship = (ImageButton) myView.findViewById(R.id.imgbtnship4);
        btnimg5ship = (ImageButton) myView.findViewById(R.id.imgbtnship5);
        btnimg6ship = (ImageButton) myView.findViewById(R.id.imgbtnship6);
        btnimg1ship.setOnClickListener(this::onClick);
        btnimg2ship.setOnClickListener(this::onClick);
        btnimg3ship.setOnClickListener(this::onClick);
        btnimg4ship.setOnClickListener(this::onClick);
        btnimg5ship.setOnClickListener(this::onClick);
        btnimg6ship.setOnClickListener(this::onClick);

        return myView;

    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        {
            case R.id.imgbtnship1:

                Intent intent1 = new Intent(getActivity(), ChooseClothes.class );
                startActivity(intent1);

                break;
            case R.id.imgbtnship2:

                break;
            case R.id.imgbtnship3:

                break;
            case R.id.imgbtnship4:

                break;
            case R.id.imgbtnship5:

                break;
            case R.id.imgbtnship6:
        }
    }
}
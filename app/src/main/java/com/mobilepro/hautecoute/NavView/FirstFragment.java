package com.mobilepro.hautecoute.NavView;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.mobilepro.hautecoute.MixMatchResult;
import com.mobilepro.hautecoute.R;
import com.mobilepro.hautecoute.Update;

public class FirstFragment extends Fragment implements View.OnClickListener{
    ImageView btnimg1,btnimg2,btnimg3;
    ImageButton btn4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view1 = inflater.inflate(R.layout.fragment_first, container, false);
        btnimg1 =  (ImageView) view1.findViewById(R.id.feed1);
        btnimg2 = (ImageView) view1.findViewById(R.id.feed2);
        btn4    = (ImageButton) view1.findViewById(R.id.imgadd);
        btnimg1.setOnClickListener(this);
        btnimg2.setOnClickListener(this);

        btn4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
               Intent intent1 = new Intent(getActivity(), Update.class);
               startActivity(intent1);
            }
        });
        return view1;

    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(getActivity(), MixMatchResult.class);
        startActivity(intent);
    }


}
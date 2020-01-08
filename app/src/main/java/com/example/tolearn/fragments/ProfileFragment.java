package com.example.tolearn.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.tolearn.R;

import java.util.Random;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {

    private ImageView ivHeader;

    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root= inflater.inflate(R.layout.fragment_profile, container, false);
        ivHeader = (ImageView)root.findViewById(R.id.ivHeader);

        randomHeaderGenerator();

        return root;
    }

    private void randomHeaderGenerator() {
        Random aleatorio = new Random(System.currentTimeMillis());
        int intAletorio = aleatorio.nextInt(5);
        switch (intAletorio){
            case 0:
                ivHeader.setImageResource(R.drawable.header1);
                break;
            case 1:
                ivHeader.setImageResource(R.drawable.header2);
                break;
            case 2:
                ivHeader.setImageResource(R.drawable.header3);
                break;
            case 3:
                ivHeader.setImageResource(R.drawable.header4);
                break;
            case 4:
                ivHeader.setImageResource(R.drawable.header5);
                break;
        }

    }

}

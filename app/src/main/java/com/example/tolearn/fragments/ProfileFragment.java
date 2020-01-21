package com.example.tolearn.fragments;


import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tolearn.R;

import java.util.Random;

import de.hdodenhof.circleimageview.CircleImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {

    private ImageView ivHeader;
    private CircleImageView CircleImageUser;
    private EditText etUsernameProf;
    private EditText etEmail;
    private EditText etFullName;
    private EditText etBithDate;
    private TextView tvCompProf;
    private ImageButton imgBtEdit;
    private ImageButton imgBtPhoto;

    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root= inflater.inflate(R.layout.fragment_profile, container, false);

        ivHeader = (ImageView)root.findViewById(R.id.ivHeader);
        CircleImageUser = (CircleImageView)root.findViewById(R.id.CircleImageUser);
        etUsernameProf = (EditText)root.findViewById(R.id.etUsernameProf);
        etEmail = (EditText)root.findViewById(R.id.etEmail);
        etFullName = (EditText)root.findViewById(R.id.etFullName);
        etBithDate = (EditText)root.findViewById(R.id.etBithDate);
        tvCompProf = (TextView) root.findViewById(R.id.tvCompProf);
        imgBtEdit = (ImageButton)root.findViewById(R.id.imgBtEdit);
        imgBtPhoto = (ImageButton)root.findViewById(R.id.imgBtPhoto);

        etUsernameProf.setEnabled(false);
        etEmail.setEnabled(false);
        etFullName.setEnabled(false);
        etBithDate.setEnabled(false);

        imgBtPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent,0);
            }
        });


        imgBtEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgBtEdit.setImageResource(R.drawable.ic_save_black_24dp);



                etUsernameProf.setEnabled(true);
                etEmail.setEnabled(true);
                etFullName.setEnabled(true);
                etBithDate.setEnabled(true);

                imgBtEdit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        imgBtEdit.setImageResource(R.drawable.ic_update_black_24dp);
                        saveData();
                    }
                });
            }
        });
        //randomHeaderGenerator();

        return root;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Bitmap bitmap = (Bitmap)data.getExtras().get("data");
        CircleImageUser.setImageBitmap(bitmap);

    }

    private void saveData() {
    }

    /*private void randomHeaderGenerator() {
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

    }*/

}

package com.example.tolearn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RecoverPassword extends AppCompatActivity {

    private EditText etEmail;
    private TextView tvRecover;
    private Button btnRecover;
    private Button btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recover_password);

        etEmail = (EditText) findViewById(R.id.etEmail);
        tvRecover = (TextView) findViewById(R.id.tvRecover);
        btnRecover = (Button) findViewById(R.id.btnRecover);
        btnCancel = (Button) findViewById(R.id.btnCancel);

        btnRecover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean esta=false;
                esta=checkEmailExist();
                if(esta==true){

                }else{

                }
            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(intent);
            }
        });
    }

    private boolean checkEmailExist() {
        boolean esta=false;
        return esta;
    }

}

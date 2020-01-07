package com.example.tolearn;

import androidx.appcompat.app.AppCompatActivity;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnLogIn;
    private Button btnRecover;
    private EditText etUsername;
    private EditText etPwd;
    private TextView tvPwd;
    private TextView tvTittle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogIn = (Button)findViewById(R.id.btnLogIn);
        btnRecover = (Button)findViewById(R.id.btnRecover);
        etUsername = (EditText)findViewById(R.id.etUsername);
        etPwd = (EditText)findViewById(R.id.etPwd);
        tvPwd = (TextView) findViewById(R.id.tvPwd);
        tvTittle = (TextView)findViewById(R.id.tvTittle);

        menuLauncher();
    }

    private void menuLauncher() {
        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),MenuActivity.class);
                startActivity(intent);
            }
        });
    }
}
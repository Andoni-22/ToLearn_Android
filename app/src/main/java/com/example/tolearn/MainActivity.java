package com.example.tolearn;

import androidx.appcompat.app.AppCompatActivity;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.tolearn.interfaces.UserInterface;
import com.example.tolearn.pojos.User;
import com.example.tolearn.retrofit.UserAPIClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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
                boolean login=true;
                //login=checkLoginData();
                if(login==true){
                    Intent intent = new Intent(getApplicationContext(),MenuActivity.class);
                    startActivity(intent);
                }

            }

            private boolean checkLoginData() {
                User user = new User();
                final boolean[] login = {false};
                String pwd, loginName;

                loginName = etUsername.getText().toString();
                pwd = etPwd.getText().toString();

                UserInterface userInterface = UserAPIClient.getClient();

                Call<User> call = (Call<User>) userInterface.login(loginName,pwd);
                call.enqueue(new Callback<User>() {
                    @Override
                    public void onResponse(Call<User> call, Response<User> response) {
                        if(response.code()==200){
                            login[0] = true;
                        }
                    }

                    @Override
                    public void onFailure(Call<User> call, Throwable t) {

                    }
                });

                return login[0];
            }
        });
    }
}
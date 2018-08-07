package com.example.arist.smartfashion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        login =(Button)findViewById(R.id.btn1);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getBaseContext(),"BIENVENIDO A SMART FASHION",Toast.LENGTH_SHORT).show();
                Intent login= new Intent(LoginActivity.this, ItemActivity.class);
                startActivity(login);
            }
        });
    }


}
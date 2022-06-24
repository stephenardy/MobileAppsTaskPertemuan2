package com.example.trainingmobileappspertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView username, email;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.tv_username);
        email = findViewById(R.id.tv_email);

        Intent intent = getIntent();
        String tempUsername = intent.getStringExtra("account_username");
        username.setText(tempUsername);
        String tempEmail = intent.getStringExtra("account_email");
        email.setText(tempEmail);





    }
}
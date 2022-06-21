package com.example.trainingmobileappspertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnClick = findViewById(R.id.btn_clickHere);

        LinearLayout linearLayout = findViewById(R.id.layout_Linear);
        btnClick.setOnClickListener(view -> {
            Toast.makeText(MainActivity.this, "Successfully Logged In!", Toast.LENGTH_SHORT).show();
                });

    }
}
package com.example.campus_quest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button settings = findViewById(R.id.settings_btn);

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveToMapIntent = new Intent( MainActivity.this, Settings_final.class);

                startActivity(moveToMapIntent);
            }});

        Button start = findViewById(R.id.start);

        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveToMapIntent = new Intent( MainActivity.this, Settings_final.class);

                startActivity(moveToMapIntent);
            }});
}}





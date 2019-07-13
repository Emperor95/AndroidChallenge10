package com.emperor.androidchallenge10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        Button btnAbout = findViewById(R.id.about_btn);
        Button btnProfile = findViewById(R.id.profile_btn);

        btnAbout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAbout = new Intent(ActivityA.this, ActivityB.class);
                startActivity(intentAbout);
            }
        });

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentAbout = new Intent(ActivityA.this, ActivityC.class);
                startActivity(intentAbout);
            }
        });
    }
}

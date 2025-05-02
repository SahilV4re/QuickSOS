package com.example.sos;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.material.color.DynamicColors;

public class HomeActivity extends AppCompatActivity {

    CardView registerContact, editMessage,sosGuides,helpline, showContact,Info, btnSosService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DynamicColors.applyToActivitiesIfAvailable(getApplication());
        setContentView(R.layout.activity_home);

        registerContact = findViewById(R.id.registerContact);
        editMessage = findViewById(R.id.editMessage);
        btnSosService = findViewById(R.id.btnSosService);
        sosGuides = findViewById(R.id.sosGuides);
        helpline = findViewById(R.id.helpline);
        Info = findViewById(R.id.instructions);
        showContact = findViewById(R.id.showContact);

        registerContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, RegisterNumberActivity.class);
                startActivity(intent);
            }
        });

        editMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, EditMessageActivity.class);
                startActivity(intent);
            }
        });

        btnSosService.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        sosGuides.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this, guide.class);
                startActivity(intent);
            }
        });
        helpline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(HomeActivity.this, soscall.class);
                startActivity(intent);
            }
        });
        Info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, Instructions.class);
                startActivity(intent);

            }
        });

        showContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, ShowContact.class);
                startActivity(intent);
            }
        });
    }
}
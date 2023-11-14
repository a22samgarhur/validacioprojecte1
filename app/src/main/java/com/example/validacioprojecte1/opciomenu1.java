package com.example.validacioprojecte1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class opciomenu1 extends AppCompatActivity {
    String nom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opciomenu1);

        Intent intent = getIntent();
        nom = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

    }
}
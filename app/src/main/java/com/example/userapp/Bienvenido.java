package com.example.userapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Bienvenido extends AppCompatActivity {

    TextView saludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);

        String message = getIntent().getStringExtra(MainActivity.mensaje);

        saludo = (TextView) findViewById(R.id.tvBienvenido);

        saludo.setText("Bienvenid@ "+message+"!");
    }
}


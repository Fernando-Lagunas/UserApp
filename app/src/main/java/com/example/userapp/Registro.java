package com.example.userapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Registro extends AppCompatActivity {

    ImageButton newAcc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        newAcc = (ImageButton) findViewById(R.id.ibAdd);

        newAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarToastShort("Registro Exitoso");
            }
        });
    }

    private void mostrarToastShort(String mensajeToast){
        Toast msg = Toast.makeText(this, mensajeToast, Toast.LENGTH_SHORT);
        msg.show();
    }
}




package com.example.userapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nombre;
    Button ing;
    Button reg;
    public static final String mensaje = "com.example.UserApp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent activityBienvenido = new Intent(this, Bienvenido.class);
        Intent activityRegistro = new Intent(this, Registro.class);

        nombre = (EditText) findViewById(R.id.etUsername);
        ing = (Button) findViewById(R.id.btnLogin);
        reg = (Button) findViewById(R.id.btnNewAcc);


        ing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = nombre.getText().toString();
                startActivity(activityBienvenido.putExtra(mensaje, message));
            }
        });

        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(activityRegistro);
            }
        });
    }
}


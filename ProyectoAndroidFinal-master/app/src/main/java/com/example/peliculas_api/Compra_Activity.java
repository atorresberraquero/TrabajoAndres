package com.example.peliculas_api;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class Compra_Activity extends AppCompatActivity {

    ImageView flecha;
    Button spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.compra);

        flecha = (ImageView) findViewById(R.id.idFlechac);

        flecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent screenChanger = new Intent(getBaseContext(),
                        MainActivity2.class
                );
                startActivity(screenChanger);
            }
        });

        spinner = (Button) findViewById(R.id.buttonCompra);

        spinner.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent screenChanger = new Intent(getBaseContext(),
                        Confirma.class
                );
                startActivity(screenChanger);
                Toast.makeText(getApplicationContext(), "Su reserva ha sido enviada a su correo", Toast.LENGTH_LONG).show();
            }

        });


    }
}
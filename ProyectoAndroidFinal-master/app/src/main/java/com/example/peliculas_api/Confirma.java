package com.example.peliculas_api;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Confirma extends AppCompatActivity {
    ImageView flecha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirmar_compra);
        flecha = (ImageView) findViewById(R.id.imageView16);

        flecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent screenChanger = new Intent(getBaseContext(),
                        MainActivity2.class
                );
                startActivity(screenChanger);
            }
        });
    }
}
package com.example.peliculas_api;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

   Button btn1;
   Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = (Button) findViewById(R.id.idPelicula);

        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent screenChanger = new Intent(getBaseContext(),
                        Filtros_hoteles_Activity.class
                );
                startActivity(screenChanger);
            }
        });

        btn2 = (Button) findViewById(R.id.idEntradas);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent screenChanger = new Intent(getBaseContext(),
                        Compra_Activity.class
                );
                startActivity(screenChanger);
            }
        });

    }
}
package com.example.peliculas_api;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Habitaciones extends AppCompatActivity {
    Button btn33;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_habitaciones);

        btn33 = (Button) findViewById(R.id.button);

        btn33.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                Intent screenChanger = new Intent(getBaseContext(),
                        Confirma.class
                );
                startActivity(screenChanger);
                Toast.makeText(getApplicationContext(), "Su reserva ha sido enviada a su correo", Toast.LENGTH_LONG).show();
            }

        });

    }
   /* public void evento(View view){
        switch (view.getId()){

            case R.id.button:
                Intent intent = new Intent(getBaseContext(), MainActivity2.class);
                startActivity(intent);
                Toast.makeText(this, "Su reserva ha sido enviada a su correo", Toast.LENGTH_SHORT).show();
                break;


        }
    }*/
}
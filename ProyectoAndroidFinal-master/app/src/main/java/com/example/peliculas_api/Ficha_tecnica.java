package com.example.peliculas_api;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.peliculas_api.entities.Index;
import com.example.peliculas_api.entities.Hoteles;
import com.example.peliculas_api.presenter.LstHotelesPresenter;
import com.example.peliculas_api.view.LstHotelesContract;

import java.util.ArrayList;


public class Ficha_tecnica extends AppCompatActivity implements LstHotelesContract.View {

   private LstHotelesPresenter lstHotelesPresenter;
   private TextView nombre;
   private TextView tituloOriginal;
   private TextView director;
   private TextView pais;
   private TextView ano;
   private TextView duracion;

   ImageView flecha;
   private Integer id;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ficha_tecnica);

        initComponents();
        initPresenter();
        initData();

        flecha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent screenChanger = new Intent(getBaseContext(),
                        Filtros_hoteles_Activity.class
                );
                startActivity(screenChanger);
            }
        });
    }


    private void initComponents(){
        flecha = findViewById(R.id.idFlechalstPelis);
        nombre = findViewById(R.id.idTitulo);
        tituloOriginal = findViewById(R.id.idTituloOriginal);
        director = findViewById(R.id.idDireccion);
        pais = findViewById(R.id.idPais);
        //ano = findViewById(R.id.idAno);
        duracion = findViewById(R.id.idDuracion);

    }

    public  void initPresenter(){
        lstHotelesPresenter = new LstHotelesPresenter(this);
    }

    public void initData(){
        lstHotelesPresenter.lstPeliculas(null);
    }

    @Override
    public void successLstPeliculas(ArrayList<Index> lstIndex) {
              for (Hoteles hoteles : lstIndex.get(0).getPeliculasFicha()){
                  Bundle miBundle = this.getIntent().getExtras();
                  if(miBundle!=null){
                      id = miBundle.getInt("idPeli");
                      if (id.equals(hoteles.getId_pelicula())){
                          nombre.setText(hoteles.getNombre());
                          tituloOriginal.setText(hoteles.getDistribuidora());
                          director.setText(hoteles.getDirector());
                          pais.setText(hoteles.getPais());
                          //ano.setText(peliculas.getAno());
                          duracion.setText(hoteles.getDuracion());

                      }
                  }
              }
    }

    @Override
    public void failureLstPeliculas(String err) {
        Toast.makeText(this,err, Toast.LENGTH_LONG).show();
    }
}
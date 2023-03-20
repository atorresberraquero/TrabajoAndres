package com.example.peliculas_api;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;


import com.example.peliculas_api.entities.Index;
import com.example.peliculas_api.entities.Hoteles;
import com.example.peliculas_api.presenter.LstHotelesPresenter;
import com.example.peliculas_api.view.LstHotelesContract;
import com.example.peliculas_api.view.lstHotelesAdapter;

import java.util.ArrayList;

public class lstHoteles extends AppCompatActivity implements LstHotelesContract.View {


   String texto;
   ImageView flecha;
   String Drama = "Drama";
   String Accion = "Accion";
   String Cinco = "Cinco";
    ArrayList<Hoteles> lstPeliculas;
    LstHotelesPresenter lstHotelesPresenter;
    ImageView imgPeli;
    RecyclerView recyclerPeliculas;



    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.lsthoteles);




           initComponentes();
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
    private void initComponentes() {
        lstPeliculas = new ArrayList<>();
        imgPeli = findViewById(R.id.idImgPeli);
        flecha = (ImageView) findViewById(R.id.idFlechalstPelis);

    }


    public  void initPresenter(){

        lstHotelesPresenter = new LstHotelesPresenter(this);
    }

    public void initData(){

        lstHotelesPresenter.lstPeliculas(null);
    }


    @Override
    public void successLstPeliculas(ArrayList<Index> lstIndex) {
        Bundle miBundle = this.getIntent().getExtras();
        if(miBundle!=null){
            lstPeliculas = lstIndex.get(0).getPeliculasMasvotadas();

            texto = miBundle.getString("Filtro");
            if(texto.equals(Drama)){
                lstPeliculas = lstIndex.get(0).getPeliculasDrama();



                Toast.makeText(this, "Peliculas de "+texto, Toast.LENGTH_SHORT).show();
            }
            if(texto.equals(Accion)){
                lstPeliculas = lstIndex.get(0).getPeliculasAccion();
                Toast.makeText(this,"Peliculas de "+texto, Toast.LENGTH_SHORT).show();
            }
            if(texto.equals(Cinco)){
                lstPeliculas = lstIndex.get(0).getPeliculasMasvotadas();
                Toast.makeText(this, "Peliculas con una valoracion"+texto, Toast.LENGTH_SHORT).show();
            }

        }else {
            lstPeliculas = lstIndex.get(0).getPeliculas();
        }

        recyclerPeliculas = (RecyclerView) findViewById(R.id.recyclerViewPelis);
        recyclerPeliculas.setLayoutManager(new LinearLayoutManager(this));

        lstHotelesAdapter adapter = new lstHotelesAdapter(lstPeliculas,this);


        recyclerPeliculas.setAdapter(adapter);





    }

    @Override
    public void failureLstPeliculas(String err) {

        Toast.makeText(this, err, Toast.LENGTH_LONG).show();
    }





}
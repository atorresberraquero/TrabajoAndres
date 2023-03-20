package com.example.peliculas_api.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.peliculas_api.R;
import com.example.peliculas_api.entities.Hoteles;


import java.util.ArrayList;

public class Ficha_tecnicaHotelAdapter extends RecyclerView.Adapter<Ficha_tecnicaHotelAdapter.ViewHolder>{

    private ArrayList<Hoteles> datospeliculas;
    private Context context;

    public Ficha_tecnicaHotelAdapter(Context context){
        this.context = context;
        datospeliculas = new ArrayList<>();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ficha_tecnica,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
         Hoteles pelicula = datospeliculas.get(position);
         holder.idTitulo.setText(pelicula.getNombre());
         holder.idTituloOriginal.setText(pelicula.getDistribuidora());
         holder.idDireccion.setText(pelicula.getDirector());
         holder.idPais.setText(pelicula.getPais());
         //holder.idAno.setText(pelicula.getAno());
         holder.idDuracion.setText(pelicula.getDuracion());

    }

    @Override
    public int getItemCount() {
        return datospeliculas.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {


       private TextView idTitulo;
       private TextView idTituloOriginal;
       private TextView idDireccion;
       private TextView idPais;
      // private TextView idAno;
       private TextView idDuracion;


        public ViewHolder(View itemView) {
            super(itemView);

            idTitulo = itemView.findViewById(R.id.idTitulo);
            idTituloOriginal= itemView.findViewById(R.id.idTituloOriginal);
            idDireccion = itemView.findViewById(R.id.idDireccion);
            idPais = itemView.findViewById(R.id.idPais);
            //idAno = itemView.findViewById(R.id.idAno);
            idDuracion = itemView.findViewById(R.id.idDuracion);

        }
    }
}

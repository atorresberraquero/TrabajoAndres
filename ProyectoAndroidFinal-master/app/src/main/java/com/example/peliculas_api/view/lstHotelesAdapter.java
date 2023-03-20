package com.example.peliculas_api.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.peliculas_api.Ficha_tecnica;
import com.example.peliculas_api.Habitaciones;
import com.example.peliculas_api.R;
import com.example.peliculas_api.entities.Hoteles;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class lstHotelesAdapter extends RecyclerView.Adapter<lstHotelesAdapter.ViewHolder>  {

    private ArrayList<Hoteles> datospeliculas;
    private Context context;


    public lstHotelesAdapter(ArrayList<Hoteles> datospeliculas , Context context) {
        this.datospeliculas = datospeliculas;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.visual_hotel,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Hoteles pelicula = datospeliculas.get(position);

        Picasso.get().load(pelicula.getImagen()).into(holder.idImgPelicula);
        holder.fichatecnica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent screenChanger = new Intent(holder.fichatecnica.getContext(),
                        Ficha_tecnica.class
                );
                Bundle filtroBundle = new Bundle();
                filtroBundle.putInt("idPeli",pelicula.getId_pelicula());

                screenChanger.putExtras(filtroBundle);
                holder.fichatecnica.getContext().startActivity(screenChanger);
            }
        });
        holder.reserhabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent screenChanger = new Intent(holder.reserhabi.getContext(),
                        Habitaciones.class
                );
                Bundle filtroBundle = new Bundle();
                filtroBundle.putInt("idPeli",pelicula.getId_pelicula());

                screenChanger.putExtras(filtroBundle);
                holder.reserhabi.getContext().startActivity(screenChanger);
            }
        });



    }

    @Override
    public int getItemCount() {
        return datospeliculas.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView idImgPelicula;
        private  Button fichatecnica;
        private  Button reserhabi;


        public ViewHolder(View itemView) {
            super(itemView);

            idImgPelicula = (ImageView) itemView.findViewById(R.id.idImgPeli);
            fichatecnica = (Button) itemView.findViewById(R.id.idFichatecnica);
            reserhabi = (Button) itemView.findViewById(R.id.idCompra);



        }
    }
}

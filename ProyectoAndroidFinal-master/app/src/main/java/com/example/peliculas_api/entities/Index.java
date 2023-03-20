package com.example.peliculas_api.entities;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Index {
    @SerializedName("peliculas")
    private ArrayList<Hoteles> peliculas;

    public ArrayList<Hoteles> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Hoteles> peliculas) {
        this.peliculas = peliculas;
    }

   @SerializedName("peliculasDrama")
    private ArrayList<Hoteles> peliculasdrama;

    public ArrayList<Hoteles> getPeliculasDrama() {
        return peliculasdrama;
    }

    public void setPeliculasDrama(ArrayList<Hoteles> peliculasdrama) {
        this.peliculasdrama = peliculasdrama;
    }

    @SerializedName("peliculasAcion")
    private ArrayList<Hoteles> peliculasaccion;

    public ArrayList<Hoteles> getPeliculasAccion() {
        return peliculasaccion;
    }

    public void setPeliculasAccion(ArrayList<Hoteles> peliculasaccion) {
        this.peliculasaccion = peliculasaccion;
    }

    @SerializedName("peliculasMasvotadas")
    private ArrayList<Hoteles> hotelesMasvotadas;

    public ArrayList<Hoteles> getPeliculasMasvotadas() {
        return hotelesMasvotadas;
    }

    public void setPeliculasMasvotadas(ArrayList<Hoteles> hotelesMasvotadas) {
        this.hotelesMasvotadas = hotelesMasvotadas;
    }

    @SerializedName("fichatecnica")
    private ArrayList<Hoteles> hotelesFicha;

    public ArrayList<Hoteles> getPeliculasFicha() {
        return hotelesFicha;
    }

    public void setPeliculasFicha(ArrayList<Hoteles> hotelesFicha) {
        this.hotelesFicha = hotelesFicha;
    }
}

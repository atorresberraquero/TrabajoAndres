package com.example.peliculas_api.utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiPeliculas {

    public  static  final  String BASE_URL =
           //"http://192.168.0.16:8080/API-Hoteles/webresources/";
            "http://192.168.104.72:8080/API-Hoteles/webresources/";//CLASE

    private  static Retrofit retrofit = null;

    public static Retrofit getPeliculas() {
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}

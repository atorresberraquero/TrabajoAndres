package com.example.peliculas_api.utils;

import com.example.peliculas_api.entities.Index;


import java.util.ArrayList;


import retrofit2.Call;
import retrofit2.http.GET;


public interface ApiInterface {
    @GET("api")
    Call<ArrayList<Index>> getApi();
}

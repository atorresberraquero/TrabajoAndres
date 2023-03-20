package com.example.peliculas_api.model;


import com.example.peliculas_api.entities.Index;
import com.example.peliculas_api.utils.ApiInterface;
import com.example.peliculas_api.utils.ApiPeliculas;
import com.example.peliculas_api.view.LstHotelesContract;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LstHotelesModel implements LstHotelesContract.Model {

    @Override
    public void lstPeliculasWS(Index index, OnLstPeliculasListener onLstPeliculasListener) {
        ApiInterface apiService = ApiPeliculas.getPeliculas().create(ApiInterface.class);

        Call<ArrayList<Index>> call = apiService.getApi();
        call.enqueue(new Callback<ArrayList<Index>>() {
            @Override
            public void onResponse(Call<ArrayList<Index>> call, Response<ArrayList<Index>> response) {
                ArrayList<Index> indexRespuesta = response.body();

                onLstPeliculasListener.onSuccess(indexRespuesta);

            }

            @Override
            public void onFailure(Call<ArrayList<Index>> call, Throwable t) {
                 onLstPeliculasListener.onFailure(t.getMessage());
            }
        });
    }
}

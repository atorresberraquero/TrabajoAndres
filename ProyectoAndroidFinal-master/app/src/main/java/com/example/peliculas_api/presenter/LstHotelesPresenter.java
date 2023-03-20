package com.example.peliculas_api.presenter;

import com.example.peliculas_api.entities.Index;
import com.example.peliculas_api.model.LstHotelesModel;
import com.example.peliculas_api.view.LstHotelesContract;

import java.util.ArrayList;

public class LstHotelesPresenter implements LstHotelesContract.Presenter {

    private  LstHotelesContract.View view;
    private LstHotelesModel lstHotelesModel;

    public LstHotelesPresenter(LstHotelesContract.View view){
        this.view = view;
        this.lstHotelesModel = new LstHotelesModel();
    }

    @Override
    public void lstPeliculas(Index index) {
        lstHotelesModel.lstPeliculasWS(null, new
                LstHotelesContract.Model.OnLstPeliculasListener() {
                    @Override
                    public void onSuccess(ArrayList<Index> index) {
                        if (index != null && index.size() > 0){
                            view.successLstPeliculas(index);
                        }else{
                            view.failureLstPeliculas("Erro en lista de datos");
                        }
                    }

                    @Override
                    public void onFailure(String error) {
                       view.failureLstPeliculas(error);
                    }
                });
    }
}
